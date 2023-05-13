package tugas.ekstensi.pertemuan.tigabelas.latihan;

public class PraktikumEmpatBelasDd {
    public static void main(String[] args) {
        int[] ints = {1, 23, 17, 4, -5, 100};
        int i;

        System.out.println("Menampilkan Data Array Dengan Looping dari depan");
        for (i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

        System.out.println();

        System.out.println("Menampilkan Data array dengan looping dari belakang");
        for (i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + " ");
        }
    }
}
