// We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left
// or right. Return true if all the g's in the given string are happy.

public boolean gHappy(String str) {
    boolean res = true;
    
    if (str.length() == 0) 
      return true;
      
    if (str.length() == 1) 
      return false;
      
    if (str.length() == 2) {
      if (str.charAt(0) == 'g' && str.charAt(1) == 'g') {
        return true;
      } else {
        return false;
      }
      
    }
    
    for (int i = 0; i < str.length(); i++) {
      if (i == 0 && str.charAt(i) == 'g' && (str.charAt(i + 1) != 'g')) 
        return false;
      
      if (i == str.length() - 1 && str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g'))
        return false;
        
      if (str.charAt(i) == 'g' && (str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g'))
        return false;
    }
    
    return res;
  }