// Given an array of ints length 3, figure out which is larger, the first or last element in the array, and 
// set all the other elements to be that value. Return the changed array.

public int[] maxEnd3(int[] nums) {
    if (nums[0] >= nums[2]) return new int[] {nums[0], nums[0], nums[0]};
    else  return new int[] {nums[2], nums[2], nums[2]};
  }