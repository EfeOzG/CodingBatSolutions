// Given two strings, a and b, create a bigger string made of the first char of a, the first char
// of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end
// of the result.

public String mixString(String a, String b) {
    int minStr = Math.min(a.length(),b.length());
    String res= "";
      for(int i = 0; i < minStr; i++) {
        res = res + a.substring(i, i+1) + b.substring(i, i+1);
      }
      return res = res + b.substring(minStr) + a.substring(minStr);
  }
  