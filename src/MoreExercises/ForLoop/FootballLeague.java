package MoreExercises.ForLoop;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Капацитетът на стадиона – цяло число в интервала [1 … 10000];
        int capacity = Integer.parseInt(scanner.nextLine());
        //2.	Броят на всички фенове – цяло число в интервала [1 … 10000].
        int fans = Integer.parseInt(scanner.nextLine());

        int counterA = 0;
        int counterB = 0;
        int counterV = 0;
        int counterG = 0;
        double perA = 0;
        double perB = 0;
        double perV = 0;
        double perG = 0;
        double perAll = 0;


        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    counterA++;
                    break;
                case "B":
                    counterB++;
                    break;
                case "V":
                    counterV++;
                    break;
                case "G":
                    counterG++;
                    break;
            }
        }
        perA = counterA * 1.0 / fans * 100;
        perB = counterB * 1.0 / fans * 100;
        perV = counterV * 1.0 / fans * 100;
        perG = counterG * 1.0 / fans * 100;
        perAll = fans *1.0 / capacity * 100;

        System.out.printf("%.2f%%\n", perA);
        System.out.printf("%.2f%%\n", perB);
        System.out.printf("%.2f%%\n", perV);
        System.out.printf("%.2f%%\n", perG);
        System.out.printf("%.2f%%\n", perAll);


    }
}
