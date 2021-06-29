public class Line {
    public static final int PRICE = 25;
    
    public static String Tickets(int[] peopleInLine) {
        int countQuarter = 0;
        int countFifty = 0;

        for (int i : peopleInLine) {
            if (i == PRICE) {
                countQuarter++;
            } else if (i == 50) {
                countQuarter--;

                if (countQuarter < 0) {
                    return "NO";
                }

                countFifty++;
            } else if (i == 100) {
                if (countFifty == 0) {
                    countQuarter -= 3;
                } else {
                    countQuarter--;
                    countFifty--;
                }
                if (countQuarter < 0 || countFifty < 0) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
