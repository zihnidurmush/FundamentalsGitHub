package Basics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine()); //•	Бюджет на групата
        String season = scanner.nextLine(); //Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        int fisherman = Integer.parseInt(scanner.nextLine()); //Брой рибари

        double totalPrice = 0;
        switch (season) {
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
        }
        if (fisherman <= 6) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        } else if (fisherman > 7 && fisherman <=11) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (fisherman > 12) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        double diff = Math.abs(budget - totalPrice);
        if (totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", diff);

        } else
            System.out.printf("Not enough money! You need %.2f leva.", diff);

    }
}
