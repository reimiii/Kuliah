package tugas.ekstensi.pertemuan.duabelas;

import java.util.Scanner;

public class PraktikumForScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka, factorial = 1;

        System.out.println("--- Mecari faktorial dari angka ---");
        System.out.print("Masukan angka: ");
        angka = scanner.nextInt();

        for (int i = 1; i <= angka; i++) {
            factorial *= i;
        }

        System.out.println("Factorial dari " + angka + " adalah " + factorial);
    }
}
