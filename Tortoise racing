public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2){
          return null;
        } else {
            int time[] = new int[3];
            double delta = v2 - v1;
            int del = (int) delta;
            double g2 = g;
            int mm;
            int ss;
            if ((g2 / delta * 60) > 60){
                double prom = (g2 / delta * 60) % 60;
                mm = (int) prom;
            } else {
                double m = g2 / delta * 60;
                mm = (int) m;
            }
            if (((g2 / delta * 3600) - (mm * 60)) > 60) {
                double prom = ((g2 / delta * 3600) - (mm * 60)) % 60;
                ss = (int) prom;
            } else {
                double s = (g2 / delta * 3600) - (mm * 60);
                ss = (int) s;
            }
            time[0] = g / del;
            time[1] = mm;
            time[2] = ss;
            return time;
        }
    }
}
