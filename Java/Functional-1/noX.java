// Given a list of strings, return a list where each string has all its "x" removed.

public List<String> noX(List<String> strings) {
    strings.replaceAll(s -> s.replace("x", ""));
    return strings;
  }