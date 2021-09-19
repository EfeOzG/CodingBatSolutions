// Given an array of strings, return a Map<String, Boolean> where each different string is a
// key and its value is true if that string appears 2 or more times in the array.

public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> m = new HashMap<>();
    for (String s : strings) {
      if (m.containsKey(s)) {
        m.put(s, true);
      } else {
        m.put(s, false);
      }
    }
    return m;
  }