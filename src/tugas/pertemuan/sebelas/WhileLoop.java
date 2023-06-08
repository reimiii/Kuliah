package tugas.pertemuan.sebelas;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Pengulangan dari 1");

        int i = 0;
        while (i < 5) {
            System.out.println("Kenaikan index " + ++i);
        }

        System.out.println("Pengulangan dari 0");

        i = 0;
        while (i < 5) {
            System.out.println("Kenaikan index " + i++);
        }
    }
}
