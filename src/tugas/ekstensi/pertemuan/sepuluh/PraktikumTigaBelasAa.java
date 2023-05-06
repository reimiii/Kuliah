package tugas.ekstensi.pertemuan.sepuluh;

import java.util.Scanner;

public class PraktikumTigaBelasAa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama anda : ");
        String name = scanner.nextLine();

        System.out.print("Berapa umur anda? \n " +
                "1. kurang dari 20th \n " +
                "2. lebih dari 20th \n " +
                "3. sama dengan 20th \n " +
                "Masukkan pilihan anda : ");
        Integer pilihanUmur = scanner.nextInt();

        switch (pilihanUmur) {
            case 1:
                System.out.println("Anda " + name + " berumur kurang dari 20th");
                break;
            case 2:
                System.out.println("Anda " + name + " berumur lebih dari 20th");
                break;
            case 3:
                System.out.println("Anda " + name + " berumur sama dengan 20th");
                break;
            default:
                System.out.println("Masukan pilihan angka antara 1-3");
        }
    }
}
