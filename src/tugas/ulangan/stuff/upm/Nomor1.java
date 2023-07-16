package tugas.ulangan.stuff.upm;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Sebuah angka : ");
        int number = scanner.nextInt();

        System.out.println("====================================");
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " : " + i + " = " + number / i + " sisa " + number % i);
            i++;
        }
    }
}
