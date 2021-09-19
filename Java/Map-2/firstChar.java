// Given an array of non-empty strings, return a Map<String, String> with a key for every
// different first character seen, with the value of all the strings starting with that character
// appended together in the order they appear in the array.

public Map<String, String> firstChar(String[] strings) {
    Map<String, String> m = new HashMap<>();
    for (String s : strings) {
      if (m.containsKey(s.substring(0,1))) {
        m.put(s.substring(0,1), m.get(s.substring(0,1)) + s);
      } else {
        m.put(s.substring(0,1), s);
      }
    }
    return m;
  }