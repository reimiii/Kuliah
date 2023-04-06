package tugas.pertemuan.lima;

import java.util.Scanner;

public class TigaDanLima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input sebuah bilangan: ");
        int bil = scanner.nextInt();

        if (bil % 3 == 0 && bil % 5 == 0) {
            System.out.println("Bilangan tersebut dapat dibagi angka 3 dan 5");
        } else {
            System.out.println("Bilangan tersebut tidak dapat dibagi angka 3 dan 5");
        }
    }
}
