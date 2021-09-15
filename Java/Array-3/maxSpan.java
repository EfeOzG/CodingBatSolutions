// Consider the leftmost and righmost appearances of some value in an array. We'll say that the
// "span" is the number of elements between the two inclusive. A single value has a span of 1.
// Returns the largest span found in the given array. (Efficiency is not a priority.)

public int maxSpan(int[] nums) {
    int span, max = 0;
    
    for (int i = 0; i < nums.length; i++) {
      span = 0;
      for (int j = i; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          span = j - i + 1;
          if (max < span) {
            max = span;
          }
        }
      }
    }
    
    return max;
  }