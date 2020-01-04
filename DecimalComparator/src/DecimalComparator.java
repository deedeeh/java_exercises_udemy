public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.176, -3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        firstNum = firstNum * 1000;
        secondNum = secondNum * 1000;
        return (int) firstNum == (int) secondNum;
    }
}
