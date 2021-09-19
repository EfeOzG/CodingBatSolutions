// Given a string, compute recursively the number of times lowercase "hi" appears in the
// string, however do not count "hi" that have an 'x' immedately before them.

public int countHi2(String str) {
    if (str.length() < 2) return 0;
    if (str.substring(str.length()-2, str.length()).equals("hi")) {
      if ((str.length() > 2 && str.charAt(str.length()-3) != 'x') || str.length() == 2 )
        return 1 + countHi2(str.substring(0, str.length()-1));
    }
    return countHi2(str.substring(0, str.length()-1));
  }