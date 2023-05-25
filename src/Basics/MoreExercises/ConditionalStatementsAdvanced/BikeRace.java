package Basics.MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine()); //броят младши велосипедисти
        int seniors = Integer.parseInt(scanner.nextLine()); //броят старши велосипедисти
        String traceType = scanner.nextLine(); //вид трасе – "trail", "cross-country", "downhill" или "road"

        double taxJuniors = 0;
        double taxSeniors = 0;
        double totalSum = 0;
        double expenses = 0;

        switch (traceType) {
            case "trail":
                taxJuniors = 5.5;
                taxSeniors = 7;
                break;
            case "cross-country":
                if (juniors + seniors < 50) {
                    taxJuniors = 8;
                    taxSeniors = 9.5;
                } else {
                    taxJuniors = 8 * 0.75;
                    taxSeniors = 9.5 * 0.75;
                }
                break;
            case "downhill":
                taxJuniors = 12.25;
                taxSeniors = 13.75;
                break;
            case "road":
                taxJuniors = 20;
                taxSeniors = 21.5;
                break;


        }
        totalSum = juniors * taxJuniors + seniors * taxSeniors;
        expenses = totalSum * 0.05;

        double rest = totalSum - expenses;

        System.out.printf("%.2f", rest);

    }
}
