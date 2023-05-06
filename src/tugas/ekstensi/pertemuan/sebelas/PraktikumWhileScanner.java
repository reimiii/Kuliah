package tugas.ekstensi.pertemuan.sebelas;

import java.util.Scanner;

public class PraktikumWhileScanner {
    public static void main(String[] args) {
        boolean running = true;
        int counter = 0;
        String answer;

        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("Apakah anda ingin Keluar?");
            System.out.print("Jawab [Y/T]> ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
    }
}
