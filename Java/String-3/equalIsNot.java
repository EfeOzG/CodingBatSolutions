// Given a string, return true if the number of appearances of "is" anywhere in the string is equal
// to the number of appearances of "not" anywhere in the string (case sensitive).

public boolean equalIsNot(String str) {
    String res = "";
    int notCount = 0;
    int isCount = 0;
    
    for (int i = 0; i < str.length()-1; i++) {
      if (i < str.length()-2 && str.substring(i, i+3).equals("not")) {
        notCount++;
      } else {
        if (str.substring(i, i+2).equals("is")) {
          isCount++;
        }
      }
    }
    return notCount == isCount;
  }
  