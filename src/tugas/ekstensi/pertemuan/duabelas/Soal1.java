package tugas.ekstensi.pertemuan.duabelas;

public class Soal1 {
    public static void main(String[] args) {
        int n = 6; // Jumlah baris yang diinginkan

        // Membuat pola segitiga bagian atas
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Membuat pola segitiga bagian bawah
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
