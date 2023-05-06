package tugas.ekstensi.pertemuan.sebelas;

import java.util.Scanner;

public class PraktikumTigaBelasAaBerulang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        String name = scanner.nextLine();

        char repeat = 'y';
        do {
            System.out.print("Berapa umur anda? \n " +
                    "1. kurang dari 20th \n " +
                    "2. lebih dari 20th \n " +
                    "3. sama dengan 20th \n " +
                    "Masukkan pilihan anda : ");
            int pickAge = scanner.nextInt();

            switch (pickAge) {
                case 1:
                    System.out.println("Anda " + name + " berumur kurang dari 20th");
                    repeat = 't';
                    break;
                case 2:
                    System.out.println("Anda " + name + " berumur lebih dari 20th");
                    repeat = 't';
                    break;
                case 3:
                    System.out.println("Anda " + name + " berumur sama dengan 20th");
                    repeat = 't';
                    break;
                default:
                    System.out.println("Masukan pilihan angka antara 1-3");
            }

        } while (repeat != 't');

        System.out.println("Terima Kasih....");
    }
}
