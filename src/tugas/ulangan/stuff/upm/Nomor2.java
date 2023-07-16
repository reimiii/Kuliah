package tugas.ulangan.stuff.upm;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input sebuah angka : ");
        int number = scanner.nextInt();

        System.out.println("====================================");
        System.out.println("Angka yang dapat membagi " + number + " tanpa sisa adalah:");

        int i = 1;
        do {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= number);
    }
}
