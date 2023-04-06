package tugas.pertemuan.lima;

import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program menentukan nilai terbesar");

        System.out.print("Input bilangan pertama: ");
        int bilOne = scanner.nextInt();

        System.out.print("Input bilangan kedua: ");
        int bilTwo = scanner.nextInt();

        if (bilOne > bilTwo) {
            System.out.println("=============================");
            System.out.println("Bilangan terbesar adalah : " + bilOne);
        } else {
            System.out.println("=============================");
            System.out.println("Bilangan terbesar adalah : " + bilTwo);
        }
    }
}
