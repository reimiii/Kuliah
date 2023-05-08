package tugas.ulangan.stuff;

import java.util.Scanner;

public class MenitKeHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari user jumlah menit
        System.out.print("Input jumlah menit: ");
        int menit = input.nextInt();

        // Menghitung jumlah tahun dan jumlah hari berdasarkan jumlah menit
        int tahun = menit / (365 * 24 * 60);
        int sisaMenit = menit % (365 * 24 * 60);
        int hari = sisaMenit / (24 * 60);

        // Menampilkan hasil konversi
        System.out.println(menit + " menit = " + tahun + " tahun " + hari + " hari");
    }
}
