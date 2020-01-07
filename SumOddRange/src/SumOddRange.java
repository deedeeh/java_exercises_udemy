public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
        System.out.println(sumOdd(10, 5));
    }
    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        } else {
            return number % 2 == 1;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(start < 0 || end < 0) {
            sum = -1;
        } else {
            if(start > end) {
                sum = -1;
            } else {
                for(int i = start; i <= end; i++) {
                    if(isOdd(i)) {
                        sum += i;
                    }
                }
            }
        }
        return sum;
    }
}
