// Given a non-empty array, return true if there is a place to split the array so that the sum
// of the numbers on one side is equal to the sum of the numbers on the other side.

public boolean canBalance(int[] nums) {
    int sumLeft = 0;
    
    for (int i = 0; i < nums.length; i++) {
      sumLeft += nums[i];
      int sumRight = 0;
      for (int j = nums.length-1; j > i; j--) {
        sumRight += nums[j];
      }
      if (sumRight == sumLeft) {
        return true;
      }
    }
    
    return false;
  }