import java.util.Scanner;
public class Array06 {

    public static void main (String [] args){
       try (Scanner input06 = new Scanner(System.in)) {
            System.out.println("===============================");
            System.out.println("Program Menghitung IP Semester");
            System.out.println("===============================");
        
        double totalnilai = 0;
        int totalsks = 0;

        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", 
                            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                            "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiangka = new double[matkul.length];
        double[] bobotnilai = new double[matkul.length];

        for (int i=0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilaiangka[i] = input06.nextDouble();
            bobotnilai[i] = hitungnilaisetara(nilaiangka[i]);
            
            totalnilai += bobotnilai[i] * 3; 
            totalsks += 3; 
        }
        
        System.out.println("=========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================");
        System.out.println("MK\t\t\t Nilai Angka\t Nilai Huruf\t Bobot Nilai");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-30s%-15.2f%-15s%-10.2f\n", matkul[i], nilaiangka[i],
                                konversinilaihuruf(nilaiangka[i]), bobotnilai[i]);
        }
        
        double ips = totalnilai / totalsks;
        System.out.println("===========================");
        System.out.println("IP : " + ips);

}}

public static double hitungnilaisetara(double nilaiangka) {
    if (nilaiangka > 80) {
        return 4.0;
    } else if (nilaiangka > 73) {
        return 3.5;
    } else if (nilaiangka > 65) {
        return 3.0;
    } else if (nilaiangka > 60) {
        return 2.5;
    } else if (nilaiangka > 50) {
        return 2.0;
    } else if (nilaiangka > 39) {
        return 1.0;
    } else {
        return 0.0;
    }
}

public static String konversinilaihuruf (double nilaiangka) {
    if (nilaiangka > 80) {
        return "A";
    } else if (nilaiangka > 73) {
        return "B+";
    } else if (nilaiangka > 65) {
        return "B";
    } else if (nilaiangka > 60) {
        return "C+";
    } else if (nilaiangka > 50) {
        return "C";
    } else if (nilaiangka > 39) {
        return "D";
    } else {
        return "E";
}
    }
}   

