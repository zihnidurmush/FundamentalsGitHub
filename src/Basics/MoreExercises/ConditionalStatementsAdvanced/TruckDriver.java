package Basics.MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine(); //Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
        double kmPerMonth = Double.parseDouble(scanner.nextLine()); //Километри на месец

        double pricePerKm = 0;
        double salary = 0;

        switch (season) {
            case "Spring":
                if (kmPerMonth <= 5000) {
                    pricePerKm = 0.75;
                } else if (kmPerMonth <= 10000) {
                    pricePerKm = 0.95;
                } else {
                    pricePerKm = 1.45;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    pricePerKm = 0.90;
                } else if (kmPerMonth <= 10000) {
                    pricePerKm = 1.10;
                } else {
                    pricePerKm = 1.45;
                }
                break;
            case "Autumn":
                if (kmPerMonth <= 5000) {
                    pricePerKm = 0.75;
                } else if (kmPerMonth <= 10000) {
                    pricePerKm = 0.95;
                } else {
                    pricePerKm = 1.45;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    pricePerKm = 1.05;
                } else if (kmPerMonth <= 10000) {
                    pricePerKm = 1.25;
                } else {
                    pricePerKm = 1.45;
                }
                break;
        }
        salary = (kmPerMonth * pricePerKm * 4) * 0.9;
        System.out.printf("%.2f", salary);
    }
}
