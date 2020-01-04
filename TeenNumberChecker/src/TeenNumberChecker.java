public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(10, 16, 11));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19)
                || (secondAge >= 13 && secondAge <= 19)
                || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
