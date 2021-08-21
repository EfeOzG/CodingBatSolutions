// We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the
// given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

public boolean unlucky1(int[] nums) {
    for (int i = 0; i < nums.length-1; i++) {
      if (nums.length > 4 && i == 2) i = nums.length-2;
      if (nums[i] == 1 && nums[i+1] == 3) return true;
    }
    return false;
  }
