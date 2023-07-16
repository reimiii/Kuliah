package tugas.ulangan.stuff.upm;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input batasan angka: ");
        int batas = scanner.nextInt();

        int genap = 0;
        int ganjil = 0;

        System.out.println("====================================");
        System.out.print("Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari " + batas + " adalah: ");
        for (int i = 1; i < batas; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
            }
        }

        System.out.println();
        System.out.println("Jumlah angka genap: " + genap);
        System.out.println("Jumlah angka ganjil: " + ganjil);
    }
}
