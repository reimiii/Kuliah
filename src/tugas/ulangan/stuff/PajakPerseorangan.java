package tugas.ulangan.stuff;

import java.util.Scanner;

public class PajakPerseorangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan kategori status pernikahan
        System.out.println("Status Kategori");
        System.out.println("1. Tidak Kawin");
        System.out.println("2. Kawin");

        // Meminta input dari user kategori status pernikahan
        System.out.print("Input status kategori: ");
        int status = input.nextInt();

        // Meminta input dari user jumlah pendapatan dalam setahun
        System.out.print("Masukkan pendapatan anda dalam 1 tahun: Rp ");
        double pendapatan = input.nextDouble();

        // Menghitung pajak berdasarkan kategori status pernikahan dan jumlah pendapatan
        double pajak = 0;
        if (status == 1) { // Jika tidak kawin
            if (pendapatan <= 70000000) {
                pajak = 0.05 * pendapatan;
            } else if (pendapatan > 70000000 && pendapatan <= 270000000) {
                pajak = 0.15 * pendapatan;
            } else {
                pajak = 0.25 * pendapatan;
            }
        } else if (status == 2) { // Jika kawin
            if (pendapatan <= 50000000) {
                pajak = 0.05 * pendapatan;
            } else if (pendapatan > 50000000 && pendapatan <= 250000000) {
                pajak = 0.15 * pendapatan;
            } else {
                pajak = 0.25 * pendapatan;
            }
        }

        // Menampilkan hasil perhitungan pajak
        System.out.println("Pajak anda adalah sebesar: Rp " + (int) pajak);
    }
}
