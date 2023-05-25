package MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        int volumePool = Integer.parseInt(scanner.nextLine());
        //•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        int pipe1 = Integer.parseInt(scanner.nextLine());
        //•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        int pipe2 = Integer.parseInt(scanner.nextLine());
        //•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]
        double hours = Double.parseDouble(scanner.nextLine());

        double firstPipeV = pipe1 * hours;
        double secondPipeV = pipe2 * hours;
        double sumOfPipes = firstPipeV + secondPipeV;

        if (volumePool >= sumOfPipes) {
            double percentage = sumOfPipes / volumePool * 100;
            double p1Percentage = firstPipeV / sumOfPipes *100;
            double p2Percentage = secondPipeV / sumOfPipes *100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentage, p1Percentage, p2Percentage );
        } else if (volumePool < sumOfPipes) {
             double diff = Math.abs(volumePool - sumOfPipes);

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, diff);
        }


    }
}
