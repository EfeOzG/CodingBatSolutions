// Given a string and a non-empty word string, return a version of the original String where al
// chars have been replaced by pluses ("+"), except for appearances of the word string which are
// preserved unchanged.

public String plusOut(String str, String word) {
    String res = "";
    
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i).startsWith(word)) {
        res += word;
        i += word.length()-1;
      } else {
        res += "+";
      }
    }
    return res;
  }