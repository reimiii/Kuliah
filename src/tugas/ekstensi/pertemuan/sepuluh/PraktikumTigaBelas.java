package tugas.ekstensi.pertemuan.sepuluh;

import java.util.Scanner;

public class PraktikumTigaBelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai index huruf (A,B,C,D,E) = ");
        String index = scanner.next();

        char character = index.charAt(0);

        switch (character) {
            case 'A':
                System.out.println("Nilai anda sangat baik");
                break;
            case 'B':
                System.out.println("Nilai anda baik");
                break;
            case 'C':
                System.out.println("Nilai anda cukup");
                break;
            case 'D':
                System.out.println("Nilai anda kurang");
                break;
            case 'E':
                System.out.println("Nilai anda sangat kurang");
                break;
            default:
                System.out.println("Salah memasukan huruf");
        }
    }
}
