// The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
// with a key for each different string, with the value the number of times that string appears
// in the array.

public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> m = new HashMap<>();
    for (String s : strings) {
      if (m.containsKey(s)) {
        m.put(s, m.get(s) + 1);
      } else {
        m.put(s, 1);
      }
    }
    return m;
  }