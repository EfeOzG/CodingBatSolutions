// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and
// no 3's are next to each other.

public boolean haveThree(int[] nums) {
    int count3 = 0;
    
    for (int i = 0; i < nums.length; i++) {
      if (i < nums.length-1 && nums[i] == 3 && nums[i+1] == 3) {
        return false;
      }
      if (nums[i] == 3) {
        count3++;
      }
    }
    
    return count3 == 3;
  }