// Return the "centered" average of an array of ints, which we'll say is the mean average of
// the values, except ignoring the largest and smallest values in the array. If there are
// multiple copies of the smallest value, ignore just one copy, and likewise for the largest
// value. Use int division to produce the final average. You may assume that the array is
// length 3 or more.

public int centeredAverage(int[] nums) {
    Arrays.sort(nums);
    int total = 0;
    for (int i = 1; i < nums.length-1; i++) {
      total += nums[i];
    }
    return total / (nums.length-2);
  }