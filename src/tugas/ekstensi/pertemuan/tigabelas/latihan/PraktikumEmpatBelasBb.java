package tugas.ekstensi.pertemuan.tigabelas.latihan;

public class PraktikumEmpatBelasBb {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Panjang array deret: " + ints.length);
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Element ke-" + ints[i]);
        }

        double[] suhu = new double[5];
        suhu[0] = 28.5;
        suhu[1] = 25.5;
        suhu[2] = 26.5;
        suhu[3] = 27.5;
        suhu[4] = 30.5;

        System.out.println("Panjang array suhu: " + suhu.length);

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("Element ke-" + suhu[i]);
        }
    }
}
