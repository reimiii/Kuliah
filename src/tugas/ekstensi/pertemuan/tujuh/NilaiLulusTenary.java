package tugas.ekstensi.pertemuan.tujuh;

import java.util.Scanner;

public class NilaiLulusTenary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai angka : ");
        int nilai = scanner.nextInt();

        String hasil = (nilai > 65) ? "Selamat, Anda Lulus." : "Maaf, Anda gagal. Silakan coba lagi";

        System.out.println("Hasil Ujian Anda: " + hasil);
    }
}
