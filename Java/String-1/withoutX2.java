// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x'
// chars, and otherwise return the string unchanged. This is a little harder than it looks.

public String withoutX2(String str) {
    if (str.length() >= 2) {
      if (str.substring(0,2).equals("xx")) {
        return str.substring(2);
      }
      if ((str.charAt(0) == 'x') && (str.charAt(1) != 'x')) {
        return str.substring(1);
      }
      if ((str.charAt(0) != 'x') && (str.charAt(1) == 'x')) {
        return str.substring(0,1).concat(str.substring(2));
      }
    }
    if ((str.length() < 2) && str.equals("x")) return "";
  
    return str;
  }