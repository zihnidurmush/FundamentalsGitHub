package Fundamentals;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double coins = 0;
        String product = "";
        double totalCoins = 0;
        double price = 0;

        while (!command.equals("Start")) {
            coins = Double.parseDouble(command);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                totalCoins += coins;
                command = scanner.nextLine();
            } else {
                System.out.printf("Cannot accept %.2f\n", coins);
                command = scanner.nextLine();
            }
        }
        while (!command.equals("End")) {
            product = command;

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    if (price <= totalCoins) {
                        totalCoins = totalCoins - price;
                        System.out.printf("Purchased %s\n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (price <= totalCoins) {
                        totalCoins = totalCoins - price;
                        System.out.printf("Purchased %s\n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (price <= totalCoins) {
                        totalCoins = totalCoins - price;
                        System.out.printf("Purchased %s\n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (price <= totalCoins) {
                        totalCoins = totalCoins - price;
                        System.out.printf("Purchased %s\n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (price <= totalCoins) {
                        totalCoins = totalCoins - price;
                        System.out.printf("Purchased %s\n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Start":
                    break;
                default:
                    System.out.println("Invalid product");
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalCoins);
    }
}
