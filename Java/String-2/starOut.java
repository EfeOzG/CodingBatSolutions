// Return a version of the given string, where for every star (*) in the string the star and the
// chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also
// yields "ad".

public String starOut(String str) {
    String res = "";
    for (int i = 0; i < str.length(); i++) {
      if (i == 0 && str.charAt(i) != '*')
        res += str.charAt(i);
      if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
        res += str.charAt(i);
      if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
        res = res.substring(0,res.length()-1);
    }
    return res;
  }