package tugas.ekstensi.pertemuan.sepuluh;

import java.util.Scanner;

public class SoalP10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Golongan anda: ");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("Gaji anda adalah " + 1500000);
                break;
            case 2:
                System.out.println("Gaji anda adalah " + 2000000);
                break;
            case 3:
                System.out.println("Gaji anda adalah " + 2500000);
                break;
            default:
                System.out.println("pilih 1..3");
        }
    }
}
