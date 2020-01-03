public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        boolean shouldWakeUp = false;
        if(isBarking && (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23)) {
            shouldWakeUp = true;
        }
        return shouldWakeUp;
    }
}
