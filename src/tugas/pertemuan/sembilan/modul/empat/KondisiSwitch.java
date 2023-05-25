package tugas.pertemuan.sembilan.modul.empat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KondisiSwitch {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Pilih menu berikut\n" +
                "1. Jus Jeruk\n" +
                "2. Jus Alpukat\n" +
                "3. Jus Wortel\n" +
                "Pilihan anda: ");
        try {
            int answer = Integer.parseInt(reader.readLine());
            switch (answer) {
                case 1:
                    System.out.println("Anda Memilih Jus Jeruk");
                    break;
                case 2:
                    System.out.println("Anda Memilih Jus Alpukat");
                    break;
                case 3:
                    System.out.println("Anda Memilih Jus Wortel");
                    break;
                default:
                    System.out.println("Anda Bingung Memilih yah?!");
            }
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan");
        }

    }
}
