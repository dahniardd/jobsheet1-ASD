import java.util.Scanner;
public class Tugas206 {
    
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.println("Pilih rumus yang ingin dihitung :");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.println("Pilihan menu yang dipilih :");

        int pilihan = input06.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan(input06);
                break;
            case 2:
                hitungJarak(input06);
                break;
            case 3:
                hitungWaktu(input06);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void hitungKecepatan(Scanner input06) {
        System.out.print("Masukkan jarak (meter): ");
        double jarak = input06.nextDouble();

        System.out.print("Masukkan waktu (detik): ");
        double waktu = input06.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }

    private static void hitungJarak(Scanner input06) {
        System.out.print("Masukkan kecepatan (meter/detik): ");
        double kecepatan = input06.nextDouble();

        System.out.print("Masukkan waktu (detik): ");
        double waktu = input06.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak: " + jarak + " meter");
    }

    private static void hitungWaktu(Scanner input06) {
        System.out.print("Masukkan jarak (meter): ");
        double jarak = input06.nextDouble();

        System.out.print("Masukkan kecepatan (meter/detik): ");
        double kecepatan = input06.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu: " + waktu + " detik");
    }
}

