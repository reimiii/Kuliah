package tugas.ekstensi.pertemuan.tigabelas.latihan;

import java.util.Scanner;

public class PraktikumEmpatBelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            System.out.print("Masukan angka : ");
            ints[i] = scanner.nextInt();
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
