// Given an array of ints, is it possible to divide the ints into two groups, so that the sums of
// the two groups are the same. Every int must be in one group or the other. Write a
// recursive helper method that takes whatever arguments you like, and make the initial call
// to your recursive helper from splitArray(). (No loops needed.)

public boolean splitArray(int[] nums) {
    return isSplittable(0, nums, 0);
  }
  
  public boolean isSplittable(int start, int[] arr, int balance) {
    if (start == arr.length) return balance == 0;
    if (isSplittable(start + 1, arr, balance + arr[start])) return true;
    if (isSplittable(start + 1, arr, balance - arr[start])) return true;
    return false;
  }