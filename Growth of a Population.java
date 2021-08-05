class Arge { 
    public static int nbYear(int p0, double percent, int aug, int p) {
        int currentPopulation = p0;
        int year = 1;
        while (currentPopulation < p){
          double suka = currentPopulation * (percent / 100);
          int percentPeople = (int) suka;
          currentPopulation = currentPopulation + percentPeople + aug;
          year = year + 1;
        }
        return year - 1; 
    }
}
