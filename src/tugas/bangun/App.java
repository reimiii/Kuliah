package tugas.bangun;

import java.util.Random;

public class App {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }


    public static void showMenu() {
        System.out.println("**********************"
                + "\nArithmetics Game"
                + "\n**********************"
        );

        var theName = input("Enter Your Name");

        while (true) {
            System.out.println();
            System.out.println("**********************"
                    + "\nArithmetics Game"
                    + "\n**********************"
                    + "\nMain Menu:"
                    + "\n1. Addition"
                    + "\n2. Substraction"
                    + "\n3. Exit"
            );

            var input = input("Pilih");
            if (input.equals("1")) {
                System.out.println();
                System.out.println("**********************"
                        + "\nArithmetics Game - Addition"
                        + "\n**********************"
                );
                viewAddition(theName);
            } else if (input.equals("2")) {
                // do something
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println(theName + ", Silakan Input");
            }
        }
    }

    public static void viewAddition(String inGameName) {
        int life = 5;
        int score = 0;
        int t = 1;
        while (score <= 100 || life != 0) {
            Random rand = new Random();
            String x = inGameName;
//            Scanner answer = new Scanner(System.in);
            int upperbound = 20;
            int p = rand.nextInt(upperbound);
            int q = rand.nextInt(upperbound);
            int r = p + q;
//            System.out.println(t + "." + "What is the result of " + p + " + " + q + ":");
            var ans = input(t + "." + "What is the result of " + p + " + " + q + " (x untuk batal) ");
            if (ans.equalsIgnoreCase("x")) {
                // exit
            }

            // dari string ke integer

//            int ans = answer.nextInt();
            if (Integer.parseInt(ans) == r) {
                System.out.println("Yes, " + x + " You are Correct!");
                score += 5;
                t += 1;
            } else if (Integer.parseInt(ans) != r) {
                System.out.println("Sorry " + x + " You are Incorrect!");
                score -= 2;
                life -= 1;
                t += 1;
            }
        }
    }
}
