package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
        double budget = Double.parseDouble(scanner.nextLine());
        //•	На втория ред е категорията – "VIP" или "Normal"
        String ticketType = scanner.nextLine();
        //•	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
        int peopleInGroup = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        if (peopleInGroup <= 4) {
            budget = budget - (budget * 0.75);
            if (ticketType.equals("VIP")) {
                ticketPrice = 499.99;
            } else if (ticketType.equals("Normal")) {
                ticketPrice = 249.99;
            }
        } else if (peopleInGroup <= 9) {
            budget = budget - (budget * 0.60);
            if (ticketType.equals("VIP")) {
                ticketPrice = 499.99;
            } else if (ticketType.equals("Normal")) {
                ticketPrice = 249.99;
            }
        } else if (peopleInGroup <= 24) {
            budget = budget - (budget * 0.50);
            if (ticketType.equals("VIP")) {
                ticketPrice = 499.99;
            } else if (ticketType.equals("Normal")) {
                ticketPrice = 249.99;
            }
        } else if (peopleInGroup <= 49) {
            budget = budget - (budget * 0.40);
            if (ticketType.equals("VIP")) {
                ticketPrice = 499.99;
            } else if (ticketType.equals("Normal")) {
                ticketPrice = 249.99;
            }
        } else  {
            budget = budget - (budget * 0.25);
            if (ticketType.equals("VIP")) {
                ticketPrice = 499.99;
            } else if (ticketType.equals("Normal")) {
                ticketPrice = 249.99;
            }
        }

        double totalSum = peopleInGroup * ticketPrice;
        double diff = Math.abs(budget - totalSum);


        if (totalSum < budget) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
