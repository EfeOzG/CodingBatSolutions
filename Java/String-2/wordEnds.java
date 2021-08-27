// Given a string and a non-empty word string, return a string made of each char just before and
// just after every appearance of the word in the string. Ignore cases where there is no char before
// or after the word, and a char may be included twice if it is between two words.

public String wordEnds(String str, String word) {
    String res = ""; 
    
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i).startsWith(word) && str.length() > word.length()) {
        if (i == 0) {
          res += str.charAt(i + word.length());
        } else if (i == str.length()-word.length()) {
          res += str.charAt(i-1);
        } else {
          res = res + str.charAt(i-1) + str.charAt(i+word.length());
        }
      }
    }
    return res;
  }