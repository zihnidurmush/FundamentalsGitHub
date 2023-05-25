package Basics.MoreExercises.ForLoop;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
        double legacy = Double.parseDouble(scanner.nextLine());
        //•	Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]
        int year = Integer.parseInt(scanner.nextLine());

        int n = year - 1800;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
            legacy = legacy - 12000;
            } else {
                legacy = legacy - (12000 + 50 * (18+i));
            }
        }
        if (legacy >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", legacy);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(legacy));
        }

    }
}
