package tugas.ekstensi.pertemuan.delapan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input jenis kelas kamar
        System.out.print("Jenis kelas kamar (Standard/Eksekutif): ");
        String kelas = br.readLine();

        // Input lama menginap
        System.out.print("Lama menginap (dalam hari): ");
        int lamaMenginap = Integer.parseInt(br.readLine());

        // Hitung biaya menginap
        int biayaMenginap = 0;
        if (kelas.equalsIgnoreCase("Standard")) {
            if (lamaMenginap <= 2) {
                biayaMenginap = lamaMenginap * 400000;
            } else {
                biayaMenginap = 2 * 400000 + (lamaMenginap - 2) * 350000;
            }
        } else if (kelas.equalsIgnoreCase("Eksekutif")) {
            if (lamaMenginap <= 2) {
                biayaMenginap = lamaMenginap * 1200000;
            } else {
                biayaMenginap = 2 * 1200000 + (lamaMenginap - 2) * 1000000;
            }
        }

        // Output total tarif yang harus dibayarkan
        System.out.println("Total tarif yang harus dibayarkan adalah Rp. " + biayaMenginap);
    }
}