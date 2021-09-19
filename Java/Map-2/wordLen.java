// Given an array of strings, return a Map<String, Integer> containing a key for every
// different string in the array, and the value is that string's length.

public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> m = new HashMap<>();
    for (String s : strings) {
      m.put(s, s.length());
    }
    return m;
  }