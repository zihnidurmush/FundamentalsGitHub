package ContidionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //Бюджет за филма
        int statist = Integer.parseInt(scanner.nextLine()); //Брой на статистите
        double suitPerPiecePrice = Double.parseDouble(scanner.nextLine()); //Цена за облекло на един статист

        double decor = budget * 0.10;
        double suitsSum = statist * suitPerPiecePrice;


        if (statist > 150) {
            suitsSum = suitsSum * 0.90;
            double totalSum = decor + suitsSum;
        }
        double totalSum = decor + suitsSum;
        double result = budget - totalSum;
        if (budget >= totalSum) {
            System.out.printf("Action!%n" + "Wingard starts filming with %.2f leva left.", Math.abs((result)));

        } else {
            System.out.printf("Not enough money!%n" + "Wingard needs %.2f leva more.", Math.abs(result));
        }
    }
}
