// Given an array of ints of odd length, look at the first, last, and middle values in the array and 
// return the largest. The array length will be a least 1.

public int maxTriple(int[] nums) {
    int res = nums[0];
    if (res <= nums[nums.length-1])
      res = nums[nums.length-1];
    if (res <= nums[nums.length/2])
      res = nums[nums.length/2];
    return res;
  }
  