public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int calcHours = minutes / 60;
        int calcMinutes = minutes % 60;
        return calcHours + "h " + calcMinutes + "m " + seconds + "s";

    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }
        int calcMinutes = seconds / 60;
        int calcSeconds = seconds % 60;
        return getDurationString(calcMinutes, calcSeconds);
    }
}
