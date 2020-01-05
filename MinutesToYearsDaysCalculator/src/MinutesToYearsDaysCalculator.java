public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1440);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hours = (int) minutes / 60;
            int days = 0;
            int years = 0;
            int remainingDays = 0;
            if (hours >= 24) {
                days = hours / 24;
            }
            if (days >= 365) {
                years = days / 365;
                remainingDays = days % 365;
            }
            if (years == 0) {
                System.out.printf("%d min = %d y and %d d",
                        minutes,
                        years,
                        days);
            } else {
                System.out.printf("%d min = %d y and %d d",
                        minutes,
                        years,
                        remainingDays);
            }
        }
    }
}
