// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of
// one group is a multiple of 10, and the sum of the other group is odd. Every int must be in
// one group or the other. Write a recursive helper method that takes whatever arguments
// you like, and make the initial call to your recursive helper from splitOdd10(). (No loops
// needed.)

public boolean splitOdd10(int[] nums) {
    return oddSplit10(0, nums, 0, 0);
  }
  
  public boolean oddSplit10(int start, int[] arr, int group1, int group2) {
    if (start == arr.length) {
      return (group1 % 2 == 1 && group2 % 10 == 0) || (group1 % 10 == 0 && group2 % 2 == 1);
    }
    if (oddSplit10(start + 1, arr, group1 + arr[start], group2)) return true;
    if (oddSplit10(start + 1, arr, group1, group2 + arr[start])) return true;
    return false;
  }