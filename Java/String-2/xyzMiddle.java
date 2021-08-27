// Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that
// the number of chars to the left and right of the "xyz" must differ by at most one. This problem
// is harder than it looks.

public boolean xyzMiddle(String str) {
    if (str.length() < 3) {
      return false;
    }
    int leftCount, rightCount;
    
    if (str.indexOf("xyz") == str.lastIndexOf("xyz")) {
      leftCount = str.indexOf("xyz");
      rightCount = str.length() - (str.indexOf("xyz") + 3);
      return Math.abs(leftCount - rightCount) <= 1;
    }
    
    leftCount = str.indexOf("xyz", str.length()/2-2);
    rightCount = str.length() - (str.indexOf("xyz", str.length()/2-2) + 3);
    return Math.abs(leftCount - rightCount) <= 1;
  }