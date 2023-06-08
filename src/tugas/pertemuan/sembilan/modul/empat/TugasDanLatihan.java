package tugas.pertemuan.sembilan.modul.empat;

import java.util.Scanner;

public class TugasDanLatihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nilai Mahasiswa: ");
        int value = scanner.nextInt();

        if (value > 9) {
            System.out.println("A+");
        } else if (value > 8){
            System.out.println("A");
        } else if (value > 7) {
            System.out.println("B");
        } else if (value > 6) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
