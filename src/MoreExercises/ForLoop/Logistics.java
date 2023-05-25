package MoreExercises.ForLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
        int number = Integer.parseInt(scanner.nextLine());
        //•	За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]
        int ton = 0;
        int totalLoads = 0;
        int price = 0;
        double total = 0;
        double avgPrice = 0;
        double microBus = 0;
        double truck = 0;
        double train = 0;


        for (int i = 1; i <= number; i++) {
            ton = Integer.parseInt(scanner.nextLine());
            totalLoads += ton;
            if (ton <= 3) {
                price = 200;
                microBus += ton;
            } else if (ton <= 11) {
                price = 175;
                truck += ton;
            } else {
                price = 120;
                train += ton;
            }
            total += price * ton;

        }
        avgPrice = total / totalLoads;
        System.out.printf("%.2f\n", avgPrice);
        System.out.printf("%.2f%%\n", microBus / totalLoads * 100);
        System.out.printf("%.2f%%\n", truck / totalLoads * 100);
        System.out.printf("%.2f%%\n", train / totalLoads * 100);

    }
}
