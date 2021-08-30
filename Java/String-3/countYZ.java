// Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
// the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y
// or z is at the end of a word if there is not an alphabetic letter immediately following it.
// (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

public int countYZ(String str) {
    int counter = 0;
    String lowCase = str.toLowerCase();
    
    for (int i = 1; i < lowCase.length(); i++) {
      if (Character.isLetter(lowCase.charAt(i))) {
        if (i + 1 == lowCase.length()) {
          if (lowCase.charAt(i) == 'y' || lowCase.charAt(i) == 'z') {
          counter++;
          }
        }
        continue;
      } else {
        if (lowCase.charAt(i-1) == 'y' || lowCase.charAt(i-1) == 'z') {
          counter++;
        }
      }
    }
    
    return counter;
  }
  