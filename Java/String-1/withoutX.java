// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and
// otherwise return the string unchanged.

public String withoutX(String str) {
    if (str.length() == 0) return "";
    if ((str.length() == 1) && str.equals("x")) return "";
    if ((str.length() == 2) && (str.charAt(0) == 'x') && str.charAt(str.length()-1) == 'x') {
        return "";
    }
    if (str.length() > 2) {
      if ((str.charAt(0) == 'x') && (str.charAt(str.length()-1) == 'x')) {
        return str.substring(1,str.length()-1);
      }
      if (str.charAt(0) == 'x') {
        return str.substring(1);
      }
      if (str.charAt(str.length()-1) == 'x') {
        return str.substring(0, str.length()-1);
      }
    }
    return str;
  }