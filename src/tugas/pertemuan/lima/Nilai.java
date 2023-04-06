package tugas.pertemuan.lima;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Nilai Mahasiswa");

        System.out.print("Input NPM: ");
        String npm = scanner.nextLine();

        System.out.print("Input Nama: ");
        String name = scanner.nextLine();

        System.out.print("Input Nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Input Nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Input Nilai UAS: ");
        double uas = scanner.nextDouble();

        double nilaiAkhir = 0.2 * tugas + 0.3 * uts + 0.5 * uas;

        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir >= 70) {
            System.out.println("Keterangan: Lulus");
        } else {
            System.out.println("Keterangan: Tidak Lulus");
        }

    }
}
