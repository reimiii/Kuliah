package tugas.ekstensi.pertemuan.delapan;

import java.util.Scanner;

public class DuaBilanganBulat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = input.nextInt();

        if (angkaPertama == angkaKedua) {
            System.out.println("Output: " + (angkaPertama + angkaKedua));
        } else {
            System.out.println("Output: " + (angkaPertama * angkaKedua));
        }
    }
}
