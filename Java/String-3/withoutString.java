// Given two strings, base and remove, return a version of the base string where all instances
// of the remove string have been removed (not case sensitive). You may assume that the remove
// string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing
//"xx" leaves "x".

public String withoutString(String base, String remove) {
    String res = "";
    String str = base.toLowerCase();
    String rem = remove.toLowerCase();
    
    for (int i = 0; i < str.length(); i++) {
      if (i <= str.length() - remove.length()) {
        if (str.substring(i, i+rem.length()).equals(rem)) {
          i += rem.length()-1;
          continue;
        }
        res += base.charAt(i);
        continue;
      } else {
        res += base.charAt(i);
      }
    }
    return res;
  }
  