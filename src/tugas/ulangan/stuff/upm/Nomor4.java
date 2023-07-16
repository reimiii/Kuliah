package tugas.ulangan.stuff.upm;

import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input jumlah baris: ");
        int rows = scanner.nextInt();

        System.out.print("Input jumlah kolom: ");
        int columns = scanner.nextInt();

        System.out.println("====================================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
