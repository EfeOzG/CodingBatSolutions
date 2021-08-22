// Given three ints, a b c, one of them is small, one is medium and one is large. Return true
// if the three values are evenly spaced, so the difference between small and medium is the
// same as the difference between medium and large.

public boolean evenlySpaced(int a, int b, int c) {
    int[] numbers = {a, b, c};
    Arrays.sort(numbers);
    
    return numbers[2] - numbers[1] == numbers[1] - numbers[0];
  }
  