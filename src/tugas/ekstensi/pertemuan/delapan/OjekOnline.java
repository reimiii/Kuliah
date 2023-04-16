package tugas.ekstensi.pertemuan.delapan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OjekOnline {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input Nama Customer
        System.out.print("Nama Customer : ");
        String nama = br.readLine();

        // Input Jarak yang akan ditempuh
        System.out.print("Jarak yang akan ditempuh (Km) : ");
        int jarak = Integer.parseInt(br.readLine());

        // Hitung Tarif
        int tarif = 0;
        if (jarak <= 4) {
            tarif = 9500;
        } else {
            tarif = 9500 + (jarak - 4) * 2500;
        }

        // Hitung Diskon
        int diskon = 0;
        if (jarak <= 10) {
            diskon = 0;
        } else if (jarak <= 15) {
            diskon = 2000;
        } else {
            diskon = 5000;
        }

        // Hitung Total Bayar
        int totalBayar = tarif - diskon;

        // Output Hasil
        System.out.println("Selamat, anda mendapatkan potongan Rp. " + diskon);
        System.out.println("Tarif yang harus dibayarkan " + nama + " adalah sebesar " + totalBayar);
    }
}
