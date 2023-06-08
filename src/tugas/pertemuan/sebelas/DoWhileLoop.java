package tugas.pertemuan.sebelas;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Pengulangan dari " + i);

        do {
            System.out.println("Kenaikan index " + --i);
        } while (i > 0);

        i = 5;
        do {
            System.out.println("Kenaikan index: " + i--);
        } while (i > 0);
    }
}
