package ContidionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine()); //Цена на екскурзията

        int puzzlesCount = Integer.parseInt(scanner.nextLine()); //Брой пъзели
        int dolls = Integer.parseInt(scanner.nextLine()); //Брой говорещи кукли
        int bears = Integer.parseInt(scanner.nextLine()); //Брой плюшени мечета
        int minions = Integer.parseInt(scanner.nextLine()); //Брой миньони
        int trucks = Integer.parseInt(scanner.nextLine()); //Брой камиончета

        double puzzlePrice = puzzlesCount * 2.60;
        double dollsPrice = dolls * 3;
        double bearPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;

        double profit = puzzlePrice + dollsPrice + bearPrice + minionsPrice + trucksPrice;
        int totalToys = puzzlesCount + dolls + bears + minions + trucks;

        if (totalToys >= 50) {
            profit = profit - (profit * 0.25);
        }
        double totalProfit = profit - (profit * 0.10);

        double diff = Math.abs(totalProfit - trip);
        if (totalProfit >= trip) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }
}
