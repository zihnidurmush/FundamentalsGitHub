package ContidionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //Бюджетът на Петър
        int videoCards = Integer.parseInt(scanner.nextLine()); //Броят видеокарти
        int cpu = Integer.parseInt(scanner.nextLine()); //Броят процесори
        int ram = Integer.parseInt(scanner.nextLine()); //Броят рам памет

        double videoCardsPrice = 250 * videoCards;
        double cpuPrice = videoCardsPrice * 0.35 * cpu;
        double ramPrice = videoCardsPrice * 0.10 * ram;

        double totalSum = videoCardsPrice + cpuPrice + ramPrice;

        if (videoCards > cpu) {
            totalSum = totalSum * 0.85;
        }
        double diff = Math.abs(budget - totalSum);
        if (totalSum <= budget) {

            System.out.printf("You have %.2f leva left!", diff);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
        }
}
