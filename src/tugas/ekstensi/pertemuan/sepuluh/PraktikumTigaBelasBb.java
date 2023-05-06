package tugas.ekstensi.pertemuan.sepuluh;

import java.util.Scanner;

public class PraktikumTigaBelasBb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama bulan : ");
        String bulan = scanner.nextLine();


        switch (bulan.toLowerCase()) {
            case "january":
                System.out.println("Bulan January");
                break;
            case "february":
                System.out.println("Bulan February");
                break;
            case "march":
                System.out.println("Bulan March");
                break;
            case "april":
                System.out.println("Bulan April");
                break;
            case "may":
                System.out.println("Bulan May");
                break;
            case "june":
                System.out.println("Bulan June");
                break;
            case "july":
                System.out.println("Bulan July");
                break;
            case "august":
                System.out.println("Bulan August");
                break;
            case "september":
                System.out.println("Bulan September");
                break;
            case "october":
                System.out.println("Bulan October");
                break;
            case "november":
                System.out.println("Bulan November");
                break;
            case "december":
                System.out.println("Bulan December");
                break;
            default:
                System.out.println("Invalid bulan " + bulan);
                break;
        }
    }
}
