// (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly
// the same numbers as the given array, but rearranged so that every 4 is immediately followed by
// a 5. Do not move the 4's, but every other number may move. The array contains the same number of
// 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear
// anywhere in the original array.

public int[] fix45(int[] nums) {
    int index = 0;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] == 4 && nums[i+1] != 5) {
        for (int j = index; j < nums.length; j++) {
          if (nums[j] == 5 && j == 0) {
            nums[0] = nums[i+1];
            nums[i+1] = 5;
            index++;
          }
          if (nums[j] == 5 && nums[j-1] != 4) {
            nums[j] = nums[i+1];
            nums[i+1] = 5;
            index = j;
            break;
          }
        }
      }
    }
    return nums;
  }