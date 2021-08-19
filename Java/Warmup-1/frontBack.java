// Given a string, return a new string where the first and last chars have been exchanged.

public String frontBack(String str) {
    if (str.length() < 2) return str;
    
    char[] ch = str.toCharArray();
    char temp = ch[0];
    ch[0] = ch[ch.length-1];
    ch[ch.length-1] = temp;
    
    return String.valueOf(ch);
  }  