// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : 
// {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

public int[] squareUp(int n) {
    if (n == 1) return new int[]{1};
  
    int[] arr = new int[n * n];
    int num = 1, counter = n;
    
    for (int i = arr.length-1; i > 0; i--) {
      if (num == n + 1) {
        num = 1;
        counter--;
      }
      if (num <= counter) {
        arr[i] = num;
      } else {
        arr[i] = 0;
      }
      num++;
    }
    return arr;
  }
  