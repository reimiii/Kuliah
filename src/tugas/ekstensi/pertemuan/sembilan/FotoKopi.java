package tugas.ekstensi.pertemuan.sembilan;

import java.util.Scanner;

public class FotoKopi {
    public static void main(String[] args) {
        final int costCustomer = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Pelanggan (Y/T) = ");
        String pelanggan = scanner.nextLine();

        System.out.print("Jumlah fotocopy = ");
        int jumlah = scanner.nextInt();
        System.out.printf("%n%n");

        if (pelanggan.equalsIgnoreCase("t")) {
            if (jumlah < 100) {
                int total = 200 * jumlah;
                System.out.println("Jumlah fotocopy = " + jumlah);
                System.out.println("Bayar = " + total);
            } else if (jumlah <= 200) {
                int total = 170 * jumlah;
                System.out.println("Jumlah fotocopy = " + jumlah);
                System.out.println("Bayar = " + total);
            } else {
                int total = 150 * jumlah;
                System.out.println("Jumlah fotocopy = " + jumlah);
                System.out.println("Bayar = " + total);
            }
        } else if (pelanggan.equalsIgnoreCase("y")) {
            int total = costCustomer * jumlah;
            System.out.println("Jumlah fotocopy = " + jumlah);
            System.out.println("Bayar = " + total);
        } else {
            System.out.println("Tolong dijawab pertanyaan...");
        }
    }
}
