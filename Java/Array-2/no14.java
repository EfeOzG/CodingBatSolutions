// Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
    boolean ones = true, fours = true;
    
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) ones = false;
      if (nums[i] == 4) fours = false;
    }
    return ones || fours;
  }