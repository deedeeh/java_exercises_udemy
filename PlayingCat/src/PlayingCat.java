public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (!summer && temperature >= 25 && temperature <= 35)
        || (summer && temperature >= 25 && temperature <= 45);
    }
}
