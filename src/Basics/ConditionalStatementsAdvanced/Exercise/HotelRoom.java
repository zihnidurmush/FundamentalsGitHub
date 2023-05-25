package Basics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine(); //месецът – May, June, July, August, September или October
        int nights = Integer.parseInt(scanner.nextLine()); //броят на нощувките

        double studioPrice = 0;
        double apartmentPrice = 0;
        double sumStudio = 0;
        double sumApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50.0;
            apartmentPrice = 65.0;
            sumStudio = studioPrice * nights;
            sumApartment = apartmentPrice * nights;
            if (nights > 7 && nights < 13) {
                sumStudio = sumStudio * 0.95;
            } else if (nights > 14) {
                sumStudio = sumStudio * 0.70;
                sumApartment = sumApartment * 0.9;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            sumStudio = studioPrice * nights;
            sumApartment = apartmentPrice * nights;
            if (nights > 14) {
                sumStudio = sumStudio * 0.80;
                sumApartment = sumApartment * 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            apartmentPrice = 77;
            sumStudio = studioPrice * nights;
            sumApartment = apartmentPrice * nights;
            if (nights > 14) {
                sumApartment = sumApartment * 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n" + "Studio: %.2f lv.", sumApartment, sumStudio);
    }
}
