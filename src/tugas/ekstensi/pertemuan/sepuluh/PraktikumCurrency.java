package tugas.ekstensi.pertemuan.sepuluh;

import java.text.NumberFormat;
import java.util.Locale;

public class PraktikumCurrency {
    public static void main(String[] args) {
        double harga = 250000000;

        NumberFormat formatEU = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.printf("Harga Pound: %s %n", formatEU.format(harga));

        NumberFormat formatJP = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.printf("Harga Yen: %s %n", formatJP.format(harga));

        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Harga Dolar: %s %n", formatUS.format(harga));

        NumberFormat formatFR = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.printf("Harga Euro: %s %n", formatFR.format(harga));

        NumberFormat formatKorea = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.printf("Harga Won: %s %n", formatKorea.format(harga));

        System.out.printf("%.2f", harga);


    }
}
