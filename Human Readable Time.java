public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    String hours = Integer.toString((seconds / 3600));
    String minutes = Integer.toString((seconds % 3600) / 60);
    String sec = Integer.toString(seconds % 60);
    if (hours.length() == 1) {
      hours = "0" + hours;
    }
    if (minutes.length() == 1) {
      minutes = "0" + minutes;
    }
    if (sec.length() == 1) {
      sec = "0" + sec;
    }
    return hours + ":" + minutes + ":" + sec;
  }
}
