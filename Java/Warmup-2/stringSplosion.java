// Given a non-empty string like "Code" return a string like "CCoCodCode".

public String stringSplosion(String str) {
    String solution = "";
    for (int i = 0; i < str.length()+1; i++) {
      solution = solution + str.substring(0, i);
    }
    return solution;
  }