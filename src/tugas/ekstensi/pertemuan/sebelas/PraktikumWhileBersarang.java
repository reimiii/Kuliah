package tugas.ekstensi.pertemuan.sebelas;

public class PraktikumWhileBersarang {
    public static void main(String[] args) {
        int i = 1;
        int j;
        while (i <= 5) {
            j = 1;
            while (j <= i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
