// Given an array of ints, return true if the number of 1's is greater than the number of 4's

public boolean more14(int[] nums) {
    int num1 = 0;
    int num4 = 0;
    
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) num1++;
      if (nums[i] == 4) num4++;
    }
    
    return num1 > num4;
  }
  