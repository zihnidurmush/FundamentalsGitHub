package Basics.MoreExercises.ForLoop;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред - колко хода ще има по време на играта – цяло число в интервала [1...100]
        int moves = Integer.parseInt(scanner.nextLine());
        //•	За всеки ход – числата, които се проверяват в кой интервал са – цели числа в интервала [-100...100]

        double number = 0;
        double points = 0;
        int counter09 = 0;
        int counter1019 = 0;
        int counter2029 = 0;
        int counter3039 = 0;
        int counter4050 = 0;
        int counterInvalid = 0;

        for (int i = 1; i <= moves; i++) {
            number = Double.parseDouble(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                counter09++;
                points += 0.2 * number;
            } else if (number >= 10 && number <= 19) {
                counter1019++;
                points += 0.3 * number;
            } else if (number >= 20 && number <= 29) {
                counter2029++;
                points += 0.4 * number;
            } else if (number >= 30 && number <= 39) {
                counter3039++;
                points += 50;
            } else if (number >= 40 && number <= 50) {
                counter4050++;
                points += 100;
            } else {
                counterInvalid++;
                points = points / 2;
            }
        }

        System.out.printf("%.2f\n", points);
        System.out.printf("From 0 to 9: %.2f%%\n", counter09 * 1.0 / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", counter1019 * 1.0 / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", counter2029 * 1.0 / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", counter3039 * 1.0 / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", counter4050 * 1.0 / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", counterInvalid * 1.0 / moves * 100);


    }
}
