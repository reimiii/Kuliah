package tugas.ekstensi.pertemuan.sebelas;

public class Soal2P11 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("unindra, ");
            } else if (i % 3 == 0) {
                System.out.print("tiga, ");
            } else if (i % 5 == 0) {
                System.out.print("lima, ");
            } else {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}
