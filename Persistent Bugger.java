class Persist {
	public static int persistence(long n) {
		int count = 0;
    long sum = 1;
    long chislo = n;
    boolean token = true;
    while(token) {
      if (n < 10) {
        break;
      }
      count = count + 1;
      while (chislo != 0){
        sum = sum * (chislo % 10);
        chislo = chislo / 10;
      }
      if (sum >= 10) {
        chislo = sum;
        sum = 1;
      } else {
        token = false;
      }
    }
    return count;
	}
}
