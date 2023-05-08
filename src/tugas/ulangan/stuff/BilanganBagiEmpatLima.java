package tugas.ulangan.stuff;

import java.util.Scanner;

public class BilanganBagiEmpatLima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari user sebuah bilangan integer
        System.out.print("Input sebuah angka: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan dapat dibagi oleh 4 dan 5
        if (bilangan % 4 == 0 && bilangan % 5 == 0) {
            System.out.println(bilangan + " dapat dibagi oleh angka 4 dan 5");
        }
        // Mengecek apakah bilangan dapat dibagi oleh salah satu dari angka 4 atau 5, tetapi tidak oleh keduanya
        else if (bilangan % 4 == 0 || bilangan % 5 == 0) {
            System.out.println(bilangan + " dapat dibagi oleh salah satu dari angka 4 atau 5, tetapi tidak oleh keduanya");
        }
        // Mengecek apakah bilangan tidak dapat dibagi oleh angka 4 atau 5
        else {
            System.out.println(bilangan + " tidak dapat dibagi oleh angka 4 atau 5");
        }
    }
}
