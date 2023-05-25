package Basics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //Бюджет
        String season = scanner.nextLine(); //сезона: "summer" или "winter"
        String typeOfHoliday = "";

        if (budget <= 100) {
            if (season.equals("summer")) {
                double moneySpent = budget * 0.3;
                typeOfHoliday = "Camp";
                System.out.printf("Somewhere in Bulgaria%n" + "%s - %.2f", typeOfHoliday, moneySpent);
            } else if (season.equals("winter")) {
                double moneySpent = budget * 0.7;
                typeOfHoliday = "Hotel";
                System.out.printf("Somewhere in Bulgaria%n" + "%s - %.2f", typeOfHoliday, moneySpent);
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                double moneySpent = budget * 0.4;
                typeOfHoliday = "Camp";
                System.out.printf("Somewhere in Balkans%n" + "%s - %.2f", typeOfHoliday, moneySpent);
            } else if (season.equals("winter")) {
                double moneySpent = budget * 0.8;
                typeOfHoliday = "Hotel";
                System.out.printf("Somewhere in Balkans%n" + "%s - %.2f", typeOfHoliday, moneySpent);
            }
        } else if (budget > 1000) {
            double moneySpent = budget * 0.9;
            typeOfHoliday = "Hotel";
            System.out.printf("Somewhere in Europe%n" + "%s - %.2f", typeOfHoliday, moneySpent);
        }
    }
}
