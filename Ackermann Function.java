import  java.lang.Math;
public class Solution {
  public static int Ackermann(int m, int n) {
    int stepen2 = (int) Math.pow(2, m);
    int stepenN = (int) Math.pow(2, n);
    if (n == 0) {
      var mm = m - 1;
      return stepen2 * stepenN - mm;
    } else {
      return stepen2 * stepenN - m;
    }
  }
}
