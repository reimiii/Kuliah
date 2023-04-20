package tugas.ekstensi.pertemuan.tujuh;

import java.util.Scanner;

public class NilaiLulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai angka : ");
        int nilai = scanner.nextInt();

        String hasil;

        if (nilai > 65) {
            hasil = "Selamat, Anda Lulus";
        } else {
            hasil = "Maaf, Anda gagal. Silakan coba lagi";
        }

        System.out.println("Hasil Ujian Anda: " + hasil);
    }
}