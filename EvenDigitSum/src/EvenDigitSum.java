public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of even numbers in a given number is " + getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number) {
        int lastDigit;
        int sum = 0;
        if(number < 0) {
            return -1;
        } else {
            while(number > 0) {
                lastDigit = number % 10;
                if(lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                number /= 10;
            }
        }
        return sum;
    }
}
