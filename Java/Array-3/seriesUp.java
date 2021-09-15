// Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} 
// (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 
// ... + n, which is known to sum to exactly n*(n + 1)/2.

public int[] seriesUp(int n) {
    int[] arr = new int[n * (n+1) / 2];
    int num = n, counter = 1;
    
    
    for (int i = arr.length - 1; i >= 0; i--) {
      if (num == 0) {
        num = n - counter;
        counter++;
      }
      arr[i] = num;
      num--;
    }
    
    return arr;
  }
  