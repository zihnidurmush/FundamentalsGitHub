package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //Бюджет – реално число
        String season = scanner.nextLine(); //Сезон – текст "Summer" или "Winter"

        String location = "";
        String place = "";
        double price = 0;

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    place = "Camp";
                    location = "Alaska";
                    price = 0.65 * budget;
                } else if (budget > 1000 && budget <= 3000) {
                    place = "Hut";
                    location = "Alaska";
                    price = 0.80 * budget;
                } else {
                    place = "Hotel";
                    location = "Alaska";
                    price = 0.90 * budget;
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    place = "Camp";
                    location = "Morocco";
                    price = 0.45 * budget;
                } else if (budget > 1000 && budget <= 3000) {
                    place = "Hut";
                    location = "Morocco";
                    price = 0.60 * budget;
                } else {
                    place = "Hotel";
                    location = "Morocco";
                    price = 0.90 * budget;
                }
                break;
        }
        System.out.printf("%s - %s - %.2f", location, place, price);
    }
}
