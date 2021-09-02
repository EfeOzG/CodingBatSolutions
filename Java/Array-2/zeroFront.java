// Return an array that contains the exact same numbers as the given array, but rearranged
// so that all the zeros are grouped at the start of the array. The order of the non-zero
// numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and
// return the given array or make a new array.

public int[] zeroFront(int[] nums) {
    int index = 0, temp;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
        index++;
      }
    }
    return nums;
  }