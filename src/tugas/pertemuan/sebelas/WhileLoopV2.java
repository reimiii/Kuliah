package tugas.pertemuan.sebelas;

public class WhileLoopV2 {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Perulangan dari " + i);

        while (i > 0) {
            System.out.println("Kenaikan index: " + --i);
        }

        i = 5;
        System.out.println("Pengulangan dari " + i);
        while (i > 0) {
            System.out.println("Kenaikan index: " + i--);
        }
    }
}
