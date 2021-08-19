// Given 2 positive int values, return the larger value that is in the 
// range 10..20 inclusive, or return 0 if neither is in that range.

public int max1020(int a, int b) {
    int ta;
    int tb;
    if (a >= 10 && a <= 20) ta = a;
    else ta = 0;
      
    if (b >= 10 && b <= 20) tb = b;
    else tb = 0;
  
    return Math.max(ta, tb);
  }