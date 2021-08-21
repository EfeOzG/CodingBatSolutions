// Given an array of ints, swap the first and last elements in the array. Return the modified array. 
// The array length will be at least 1.

public int[] swapEnds(int[] nums) {
    int a = nums[0];
    int b = nums[nums.length-1];
    nums[0] = b;
    nums[nums.length-1] = a;
    return nums;
  }