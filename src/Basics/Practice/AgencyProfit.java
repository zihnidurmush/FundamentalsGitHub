package Basics.Practice;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); //Име на авиокомпанията - текст
        int adultsTicket = Integer.parseInt(scanner.nextLine()); //Брой билети за	 възрастни – цяло число
        int kidsTicket = Integer.parseInt(scanner.nextLine()); //Брой детски билети – цяло число
        double PriceAdult = Double.parseDouble(scanner.nextLine()); //Нетна цена на билет за възрастен – реално число
        double taxPrice = Double.parseDouble(scanner.nextLine()); //Цената на такса обслужване - реално число

        double netKidsTicketPrice = PriceAdult * 0.3;

        double adultSum = (PriceAdult +taxPrice) * adultsTicket;
        double kidsSum = (netKidsTicketPrice + taxPrice) * kidsTicket;

        double totalTicketPrice = adultSum + kidsSum;
        double profit = totalTicketPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name, profit);

    }
}
