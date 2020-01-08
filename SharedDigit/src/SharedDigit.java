public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(90, 99));
    }
    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
           return false;
        } else {
            return (firstNum / 10 == secondNum / 10)
                    || (firstNum / 10 == secondNum % 10)
                    || (firstNum % 10 == secondNum % 10)
                    || (firstNum % 10 == secondNum / 10);
        }
    }
}
