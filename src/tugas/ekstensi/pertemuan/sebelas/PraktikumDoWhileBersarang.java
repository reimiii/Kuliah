package tugas.ekstensi.pertemuan.sebelas;

public class PraktikumDoWhileBersarang {
    public static void main(String[] args) {
        int i = 1;
        int j;

        do {
            j = 1;
            do {
                System.out.print(i + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
