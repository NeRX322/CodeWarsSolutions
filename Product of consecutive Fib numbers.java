public class ProdFib {
	public static long[] productFib(long prod) {
    boolean token = true;
    int equal = 0;
    long F0 = 1;
    long F1 = 1;
    long F2 = 2;
    long chislo = prod;
    while (token) {
      if (F0 * F1 == chislo) {
        token = false;
        equal = 1;
      } else if (F0 * F1 > chislo) {
        token = false;
        equal = 0;
      } else {
        F0 = F1;
        F1 = F2;
        F2 = F1 + F0;
      }
    }
    long[] result = new long[] {F0, F1, equal};
		return result;
   }
}
