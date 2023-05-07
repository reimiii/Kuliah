package tugas.ekstensi.pertemuan.sembilan;

import java.util.Scanner;

public class RentalMobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double oneCar = 350000;
        final double penalty = 0.3;

        System.out.print("Masukan jumlah Mobil yang di pinjam: ");
        int amountCar = scanner.nextInt();
        boolean five = amountCar >= 5;

        if (five) {
            System.out.println("Maaf hanya boleh pinjam 5 mobil. MOBIL YANG ANDA PINJAMM TERLALU BANYAK..!!");
            System.exit(1);
        }

        System.out.print("Masukan lama pinjam: ");
        int rentDay = scanner.nextInt();
        boolean seven = rentDay >= 7;

        double total = oneCar * amountCar;
        double totalPenalty = total * penalty;
        double totalPlusPenalty = total + totalPenalty;

        if (!five) {
            if (seven) {
                System.out.println("denda anda adalah: " + totalPenalty);
                System.out.println("harga plus denda anda adalah: " + totalPlusPenalty);
            } else {
                System.out.println("Harga total yang harus anda bayar adalah: " + total);
            }
        }
    }
}
