public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }
    public static boolean isPalindrome(int number) {
        int initialNum = number;
        int reverse = 0;
        int lastDigit;
        while(number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse == initialNum;
    }
}
