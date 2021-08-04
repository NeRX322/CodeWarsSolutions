class DivSeven {
    public static long[] seven(long m) {
        long chislo = m;
        int shagi = 0;
        int isDivisible = 1;
        long ostatok = 0;
        long promezhutok = 0;
        long otvet = 0;
        while (true) {
            if (chislo < 100) {
                break;
            }
            shagi = shagi + 1;
            ostatok = chislo % 10;
            promezhutok = chislo / 10;
            otvet = promezhutok - (ostatok * 2);
            chislo = otvet;
            if ((otvet < 100) && (otvet % 7 != 0)) {
                break;
            }
            if ((otvet % 7 == 0) && (otvet < 100)) {
              break;
            }
        }
        return new long[] {otvet, shagi};
    }
}
