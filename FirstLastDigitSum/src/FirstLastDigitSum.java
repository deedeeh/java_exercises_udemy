public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit;
        if (number < 0) {
            return -1;
        } else {
            lastDigit = number % 10;
            while (number >= 10) {
                number /= 10;
            }
            return number + lastDigit;
        }
    }
}
