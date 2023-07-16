package tugas.ulangan.stuff.upm;

import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input bilangan ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("====================================");
        System.out.print("Data yang diinput adalah : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
