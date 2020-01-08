public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(23, 32, 442));
        System.out.println(isValid(1051));
        System.out.println(isValid(105));
    }
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if((first < 10 || first > 1000) || (second < 10 || second > 1000) || (third < 10 || third > 1000)) {
            return false;
        } else {
            return (first % 10 == second % 10)
                    || (first % 10 == third % 10)
                    || (second % 10 == third % 10);
        }
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
