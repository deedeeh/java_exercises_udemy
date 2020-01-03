public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainingKiloBytes = kiloBytes % 1024;
            int megaBytes = (kiloBytes - remainingKiloBytes) / 1024;
            System.out.printf("%d KB = %d MB and %d KB",
                    kiloBytes,
                    megaBytes,
                    remainingKiloBytes);
        }
    }
}
