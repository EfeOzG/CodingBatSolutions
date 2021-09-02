// Given a non-empty array of ints, return a new array containing the elements from the
// original array that come after the last 4 in the original array. The original array will contain
// at least one 4. Note that it is valid in java to create an array of length 0.

public int[] post4(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        count = i+1;
      }
    }
    int[] arr = new int[nums.length - count];
    for (int j = 0; j < arr.length; j++) {
      arr[j] = nums[count + j];
    }
    
    return arr;
  }
  