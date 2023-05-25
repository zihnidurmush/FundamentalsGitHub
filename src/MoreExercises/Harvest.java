package MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMeters = Integer.parseInt(scanner.nextLine()); //X кв.м е лозето – цяло число
        double grapesPerM2 = Double.parseDouble(scanner.nextLine()); //Y грозде за един кв.м – реално число
        int wineNeeded = Integer.parseInt(scanner.nextLine()); //Z нужни литри вино – цяло число
        int workers = Integer.parseInt(scanner.nextLine()); //брой работници – цяло число

        double totalHarvest = squareMeters * grapesPerM2;
        double wineAmount = (totalHarvest * 0.4) / 2.5;

        if (wineAmount >= wineNeeded) {
            double leftover = Math.ceil(wineAmount - wineNeeded);
            double perPerson = Math.ceil(leftover / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineAmount));
            System.out.printf("%.0f liters left -> %.0f liters per person.", leftover, perPerson);

        } else if (wineAmount < wineNeeded) {
            double diff = Math.floor(wineNeeded - wineAmount);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);
        }


    }
}
