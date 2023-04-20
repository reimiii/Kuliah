package tugas.ekstensi.pertemuan.tujuh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NilaiLulusBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int nilai;

        try {
            System.out.print("Ketikan Nama : ");
            name = reader.readLine();

            System.out.print("Masukan Nilai : ");
            nilai = Integer.parseInt(reader.readLine());

            if (nilai >= 80) {
                System.out.println("Nama Anda: " + name + ", Nilai Anda: " + nilai + ", Predikat A");
            } else if (nilai >= 70) {
                System.out.println("Nama Anda: " + name + ", Nilai Anda: " + nilai + ", Predikat B");
            } else if (nilai >= 60) {
                System.out.println("Nama Anda: " + name + ", Nilai Anda: " + nilai + ", Predikat C");
            } else if (nilai >= 50) {
                System.out.println("Nama Anda: " + name + ", Nilai Anda: " + nilai + ", Predikat D");
            } else {
                System.out.println("Nama Anda: " + name + ", Nilai Anda: " + nilai + ", Predikat E");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error....!!");
            // System.exit(1);
        }
    }
}
