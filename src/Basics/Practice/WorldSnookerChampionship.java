package Basics.Practice;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//1.	Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
String stage = scanner.nextLine();
//2.	Вид на билета – текст - “Standard”, “Premium” или “VIP”
        String ticketType = scanner.nextLine();
//3.	Брой билети – цяло число в интервала [1 … 30]
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
//4.	Снимка с трофея – символ – 'Y' (да) или 'N' (не)
        char character = scanner.nextLine().charAt(0);

        double ticketPrice = 0;

        switch (stage) {
            case "Quarter final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 55.50;
                        break;
                    case "Premium":
                        ticketPrice = 105.20;
                        break;
                    case "VIP":
                        ticketPrice = 118.90;
                        break;
                }
                break;
            case "Semi final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 75.88;
                        break;
                    case "Premium":
                        ticketPrice = 125.22;
                        break;
                    case "VIP":
                        ticketPrice = 300.40;
                        break;
                }
                break;
            case "Final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 110.10;
                        break;
                    case "Premium":
                        ticketPrice = 160.66;
                        break;
                    case "VIP":
                        ticketPrice = 400;
                        break;
                }
                break;
        }

        double ticketSum = ticketPrice * numberOfTickets;

        if (ticketSum > 4000) {
            ticketSum = ticketSum * 0.75;
            switch (character) {
                case 'Y':
                    character = 0;
                    break;
                case 'N':
                    character = 0;
                    break;
            }
            double photoSum = character * numberOfTickets;
            System.out.printf("%.2f", ticketSum + photoSum);

        } else if (ticketSum > 2500) {
            ticketSum = ticketSum * 0.90;
            switch (character) {
                case 'Y':
                    character = 40;
                    break;
                case 'N':
                    character = 0;
                    break;
            }
            double photoSum = character * numberOfTickets;
            System.out.printf("%.2f", ticketSum + photoSum);
        } else {
            ticketSum = ticketSum;
            switch (character) {
                case 'Y':
                    character = 40;
                    break;
                case 'N':
                    character = 0;
                    break;
            }
            double photoSum = character * numberOfTickets;
            System.out.printf("%.2f", ticketSum + photoSum);
        }

    }
}
