import java.util.Scanner;
public class Tugas106 {

    private static final char[] KODE = {'A', 'B', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M'};
    private static final String[][] KOTA = {
        {"DKI Jakarta"},
        {"Jawa Barat"},
        {"Jawa Tengah"},
        {"Yogyakarta"},
        {"Jawa Timur"},
        {"Banten"},
        {"Lampung"},
        {"DKI Jakarta"},
        {"Jawa Timur"},
        {"Maluku"}
    };

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.print("Masukkan kode plat nomor : ");
        String kodePlat = input06.nextLine().toUpperCase();

        int indexKode = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (kodePlat.charAt(0) == KODE[i]) {
                indexKode = i;
                break;
            }
        }
        if (indexKode == -1) {
            System.out.println("Kode plat tidak valid!");
            return;
        }
        System.out.println("Nama kota: " + KOTA[indexKode][0]);
    }
}


