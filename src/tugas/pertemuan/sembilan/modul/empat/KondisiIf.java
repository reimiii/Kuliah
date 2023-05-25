package tugas.pertemuan.sembilan.modul.empat;

import java.util.Scanner;

public class KondisiIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilih Jenis Kelamin Anda [1.Wanita 2.Pria]: ");
        int answer = scanner.nextInt();

        if (answer == 1) {
            System.out.print("Apakah anda Cantik [1.Ya 2.Tidak]: ");
            answer = scanner.nextInt();
            if (answer == 1) {
                System.out.println("Anda Calon Artis Indonesian Idol");
            } else if (answer == 2) {
                System.out.println("Anda Calon Pembantu Bos");
            } else {
                System.out.println("Silakan bercermin dulu");
            }
        } else if (answer == 2) {
            System.out.print("Apakah anda Ganteng? [1.Ya 2.Tidak]: ");
            answer = scanner.nextInt();
            if (answer == 1) {
                System.out.println("Anda Calon Aktor Sinetron");
            } else if (answer == 2) {
                System.out.println("Anda Calon Pengganti Tukul Arwana");
            } else {
                System.out.println("Silahkan Bercermin Dulu");
            }
        } else {
            System.out.println("Anda Pemilih yang kurang cerdas");
        }
    }
}
