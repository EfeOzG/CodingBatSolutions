// We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
// Loop over and then return the given array of non-empty strings as follows: if a string
// matches an earlier string in the array, swap the 2 strings in the array. A particular first
// char can only cause 1 swap, so once a char has caused a swap, its later swaps are
// disabled. Using a map, this can be solved making just one pass over the array. More
// difficult than it looks.

public String[] firstSwap(String[] strings) {
    Map<String, Integer> m = new HashMap<>();
    
    for (int i = 0; i < strings.length; i++) {
      if (m.containsKey(strings[i].substring(0,1)) && m.get(strings[i].substring(0,1)) >= 0) {
        String temp = strings[i];
        strings[i] = strings[m.get(strings[i].substring(0,1))];
        strings[m.get(strings[i].substring(0,1))] = temp;
        m.put(strings[i].substring(0,1), -1);
      } else if (!m.containsKey(strings[i].substring(0,1))) {
        m.put(strings[i].substring(0,1), i);
      }
    }
    return strings;
  }