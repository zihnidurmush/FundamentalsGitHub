package MoreExercises.WhileLoop;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int payCount = 0;
        double sumCollected = 0;
        boolean sumReached = false;
        double cashCount = 0;
        double cardCount = 0;
        double cashSum = 0;
        double cardSum = 0;


        while (!command.equals("End")) {
            int price = Integer.parseInt(command);
            payCount++;

            if (payCount % 2 != 0) {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    sumCollected += price;
                    cashCount++;
                    cashSum += price;
                }
            } else {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    sumCollected += price;
                    cardCount++;
                    cardSum += price;
                }
            }
            if (sumCollected > sum) {
                sumReached = true;
                break;
            }


            command = scanner.nextLine();
        }

        double avgCash = cashSum / cashCount;
        double avgCard = cardSum / cardCount;
        if (sumReached) {
            System.out.printf("Average CS: %.2f%n", avgCash);
            System.out.printf("Average CC: %.2f%n", avgCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}