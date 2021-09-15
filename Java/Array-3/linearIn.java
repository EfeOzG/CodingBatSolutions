// Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the
// numbers in inner appear in outer. The best solution makes only a single "linear" pass of both
// arrays, taking advantage of the fact that both arrays are already in sorted order.

public boolean linearIn(int[] outer, int[] inner) {
    int index = 0;
    for (int i = 0; i < outer.length && index < inner.length; i++)
      if (outer[i] == inner[index]) index++;
    return index == inner.length;
  }
  