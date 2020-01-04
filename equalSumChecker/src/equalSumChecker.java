public class equalSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, -1, 0));
    }
    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum == thirdNum;
    }
}
