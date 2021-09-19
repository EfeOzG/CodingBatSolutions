// Given an array of non-empty strings, create and return a Map<String, String> as follows:
// for each string add its first character as a key with its last character as the value.

public Map<String, String> pairs(String[] strings) {
    Map<String, String> m = new HashMap<>();
    for (String s : strings) {
      m.put(s.substring(0,1), s.substring(s.length()-1));
    }
    return m;
  }