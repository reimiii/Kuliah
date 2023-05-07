package tugas.ekstensi.pertemuan.duabelas;

public class Soal2 {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0 hingga 100:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Memeriksa apakah bilangan i adalah prima
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Jika bilangan i adalah prima, maka tampilkan
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
