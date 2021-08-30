// Given a string, return the longest substring that appears at both the beginning and end of
// the string without overlapping. For example, sameEnds("abXab") is "ab".

public String sameEnds(String string) {
    String res = "";
    for (int i = 0; i < string.length()/2; i++) {
      String control = string.substring(0, i+1);
      if (string.endsWith(control)) {
        res = control;
      }
    }
    return res;
  }
  