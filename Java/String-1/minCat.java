// Given two strings, append them together (known as "concatenation") and return the result. However,
// if the strings are different lengths, omit chars from the longer string so it is the same length
// as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

public String minCat(String a, String b) {
    int shortLen = Math.min(a.length(), b.length());
    
    if (shortLen == 0) return "";
    
    if (a.length() > shortLen) return a.substring(a.length()-shortLen).concat(b);
    if (b.length() > shortLen) return a.concat(b.substring(b.length()-shortLen));
    
    return a.concat(b);
  }