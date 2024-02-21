import java.util.Scanner;
public class Perulangan06 {
    
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = input06.nextLine();
        System.out.println("======================");
        int n = Integer.parseInt(nim.substring(nim.length() - 2)); 

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 && i == 10) {
                    continue;
                }
                else if (i % 2 != 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(i +" ");
                }
            }
        }
    }


