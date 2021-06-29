public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int n = 0;
    int s = 0;
    int w = 0;
    int e = 0;
    for (int i = 0; i < walk.length; i++){
      if (walk[i] == 'n') {
        n = n + 1;
      }
      if (walk[i] == 's') {
        s = s + 1;
      }
      if (walk[i] == 'w') {
        w = w + 1;
      }
      if (walk[i] == 'e') {
        e = e + 1;
      }
    }
    if (n - s == 0 & w - e == 0 & n + s + w + e == 10) {
      return true;
    } else {
      return false;
    }
  }
}
