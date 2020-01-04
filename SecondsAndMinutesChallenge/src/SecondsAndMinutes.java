public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int calcHours = minutes / 60;
        int calcMinutes = minutes % 60;
        String hoursString = calcHours + "h";
        String minutesString = calcMinutes + "m";
        String secondsString = seconds + "s";
        if(calcHours < 10) {
            hoursString = "0" + hoursString;
        }
        if (calcMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int calcMinutes = seconds / 60;
        int calcSeconds = seconds % 60;
        return getDurationString(calcMinutes, calcSeconds);
    }
}
