package tugas.ekstensi.pertemuan.tigabelas.soal;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[10];
        int v = 0;

        for (int i = 0; i < ints.length; i++) {
            System.out.print("Masukan angka: ");
            ints[i] = scanner.nextInt();
            v += ints[i];
        }

        int avg = v / ints.length;

        System.out.println("Jumlah seluruh bilangan: " + v);
        System.out.println("Nilai rata-ratanya adalah: " + avg);

    }
}
