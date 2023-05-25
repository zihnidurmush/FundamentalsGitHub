package Exam;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine()); //броят на котките - цяло число


        double oneKgFood = 12.45;
        int smallCatsCounter = 0;
        int bigCatsCounter = 0;
        int giantCatsCounter = 0;
        double smallSum = 0;
        double bigSum = 0;
        double giantSum = 0;
        double sumOfFood = 0;

        for (int i = 0; i < cats; i++) {
            double gramsPerCat = Double.parseDouble(scanner.nextLine()); //за всяка котка - Х грама храна - реално число
            if (gramsPerCat >= 100 & gramsPerCat < 200) {
                smallCatsCounter++;
                sumOfFood = sumOfFood + gramsPerCat;
            } else if (gramsPerCat >= 200 & gramsPerCat < 300) {
                bigCatsCounter++;
                sumOfFood = sumOfFood + gramsPerCat;
            } else if (gramsPerCat >= 300 & gramsPerCat < 400) {
                giantCatsCounter++;
                sumOfFood = sumOfFood + gramsPerCat;
            }
        }

        double priceInKg = sumOfFood / 1000;
        double pricePerDay = priceInKg * oneKgFood;


        //"Group 1: {броят на котките в група 1: малки котки} cats."
        System.out.printf("Group 1: %d cats.%n", smallCatsCounter);
        //"Group 2: {броят на котките в група 2: големи котки} cats."
        System.out.printf("Group 2: %d cats.%n", bigCatsCounter);
        //"Group 3: {броят на котките в група 3: огромни котки} cats."
        System.out.printf("Group 3: %d cats.%n", giantCatsCounter);
        //"Price for food per day: {цената за храната} lv."
        System.out.printf("Price for food per day: %.2f lv.", pricePerDay);
    }
}
