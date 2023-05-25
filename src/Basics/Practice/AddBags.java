package Basics.Practice;

import java.util.Scanner;

public class AddBags {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baggagePriceAbove20Kg = Double.parseDouble(scanner.nextLine()); //Цената на багаж над 20 кг
        double baggageKg = Double.parseDouble(scanner.nextLine()); //Килограми на багажа
        int daysOfTravel = Integer.parseInt(scanner.nextLine()); //Дни до пътуването
        int numberOfBagagge = Integer.parseInt(scanner.nextLine()); //Брой багажи

        double bagageFee = 0;

        if (baggageKg < 10) {
            bagageFee = baggagePriceAbove20Kg * 0.20;
        } else if (baggageKg >= 10 && baggageKg <= 20) {
            bagageFee = baggagePriceAbove20Kg * 0.50;
        } else if (baggageKg > 20) {
            bagageFee = baggagePriceAbove20Kg;
        }

        if (daysOfTravel > 30) {
            bagageFee = bagageFee * 1.10;
        } else if (daysOfTravel <= 30 && daysOfTravel >= 7) {
            bagageFee = bagageFee * 1.15;
        } else if (daysOfTravel < 7) {
            bagageFee = bagageFee * 1.40;
        }


        System.out.printf("The total price of bags is: %.2f lv.", bagageFee * numberOfBagagge);



    }
}
