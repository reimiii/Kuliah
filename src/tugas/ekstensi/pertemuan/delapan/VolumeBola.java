package tugas.ekstensi.pertemuan.delapan;

import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jari-jari bola dari user
        System.out.print("Input jari-jari bola: ");
        double jariJari = scanner.nextDouble();

        // Menghitung volume bola dengan rumus V = 4/3 * pi * r^3
        double pi = 3.14;
        double volume = 4.0 / 3.0 * pi * (jariJari * jariJari * jariJari);

        // Menampilkan hasil
        System.out.printf("Volume bola adalah: %.3f\n", volume);
    }
}
