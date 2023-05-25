package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerTypes = scanner.nextLine(); //Вид цветя "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        int flowersCount = Integer.parseInt(scanner.nextLine()); //Брой цветя
        int budget = Integer.parseInt(scanner.nextLine()); //Бюджет

        double totalPrice = 0;

        switch (flowerTypes) {
            case "Roses":
                totalPrice = flowersCount * 5;
                if (flowersCount > 80) {
                    totalPrice = totalPrice * 0.9;
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.8;
                if (flowersCount > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.8;
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount * 2.5;
                if (flowersCount < 80) {
                    totalPrice = totalPrice * 1.2;
                }
                break;
        }
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowerTypes, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - totalPrice));
        }
    }
}
