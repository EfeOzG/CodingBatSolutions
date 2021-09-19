// Loop over the given array of strings to build a result string like this: when a string appears
// the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty
// string if no string appears a 2nd time.

public String wordAppend(String[] strings) {
    String str = "";
    Map<String, Integer> m = new HashMap<>();
    for (String s : strings) {
      if (m.containsKey(s)) {
        m.put(s, m.get(s) + 1);
      } else {
        m.put(s, 1);
      }
      if (m.get(s) != 1 && m.get(s) % 2 == 0) {
        str += s;
      }
    }
    return str;
  }