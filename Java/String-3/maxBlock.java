// Given a string, return the length of the largest "block" in the string. A block is a run of
// adjacent chars that are the same.

public int maxBlock(String str) {
    int res = 0;
    int temp = 1;
    if (str.length() == 0) return 0;
    
    for (int i = 0; i < str.length()-1; i++) {
      if (str.charAt(i) == str.charAt(i+1)) {
        temp++;
      } else {
        temp = 1;
      }
      if (temp > res) {
        res = temp;
      }
    }
    return res;
  }