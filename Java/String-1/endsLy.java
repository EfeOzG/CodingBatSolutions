// Given a string, return true if it ends in "ly".

public boolean endsLy(String str) {
    if (str.length() < 2) {
      return false;
    } else {
      return (str.substring(str.length()-2).equals("ly"));
    }
  }