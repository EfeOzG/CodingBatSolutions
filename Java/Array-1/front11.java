// Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
// If either array is length 0, ignore that array.

public int[] front11(int[] a, int[] b) {
    if (a.length == 0 && b.length > 0) return new int[] {b[0]};
    if (b.length == 0 && a.length > 0) return new int[] {a[0]};
    if (a.length == 0 && b.length == 0) return new int[] {};
    return new int[] {a[0], b[0]};
  }
  