public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(14, 18));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestCommonDivisor = 0;
        if(first < 10 || second < 10) {
            return -1;
        } else {
            for(int i = 100; i >= 2; i--) {
                if(first % i == 0 && second % i == 0) {
                    greatestCommonDivisor = i;
                    break;
                }
            }
        }
        return greatestCommonDivisor;
    }
}
