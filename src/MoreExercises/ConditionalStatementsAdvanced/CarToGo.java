package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //Бюджет – реално число
        String season = scanner.nextLine(); //Сезон – текст "Summer" или "Winter"

        String classType = "";
        double price = 0;
        String carType = "";

        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    classType = "Economy class";
                    carType = "Cabrio";
                    price = 0.35 * budget;
                } else if (budget > 100 && budget <= 500) {
                    classType = "Compact class";
                    carType = "Cabrio";
                    price = 0.45 * budget;
                } else {
                    classType = "Luxury class";
                    carType = "Jeep";
                    price = 0.90 * budget;
                }
                break;
            case "Winter":
                if (budget <= 100) {
                    classType = "Economy class";
                    carType = "Jeep";
                    price = 0.65 * budget;
                } else if (budget > 100 && budget <= 500) {
                    classType = "Compact class";
                    carType = "Jeep";
                    price = 0.80 * budget;
                } else {
                    classType = "Luxury class";
                    carType = "Jeep";
                    price = 0.90 * budget;
                }
                break;
        }
        System.out.println(classType);
        System.out.printf("%s - %.2f", carType, price);
    }
}
