// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of
// the two groups is the same, with these constraints: all the values that are multiple of 5
// must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5)
// must be in the other. (No loops needed.)

public boolean split53(int[] nums) {
    return isSplittable(0, nums, 0);
  }
  
  public boolean isSplittable(int start, int[] arr, int target) {
    if (start == arr.length) return target == 0;
    if (arr[start] % 5 == 0) {
      return isSplittable(start + 1, arr, target + arr[start]);
    }
    if (arr[start] % 3 == 0) {
      return isSplittable(start + 1, arr, target - arr[start]);
    }
    if (isSplittable(start + 1, arr, target + arr[start])) return true;
    if (isSplittable(start + 1, arr, target - arr[start])) return true; 
    return false;
  }
  