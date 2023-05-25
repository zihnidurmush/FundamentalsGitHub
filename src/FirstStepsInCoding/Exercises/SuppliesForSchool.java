package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litersPrep = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());
        double priceBeforeDiscount = pens * 5.8 + markers * 7.20 + litersPrep * 1.20;
        double finalPrice = priceBeforeDiscount - priceBeforeDiscount * percentDiscount / 100;
        System.out.println(finalPrice);

        // Пакет химикали - 5.80 лв.
        //double pens = 5.80;
        //int penPieces = Integer.parseInt(scanner.nextLine());
        // Пакет маркери - 7.20 лв.
        //double markers = 7.20;
        //int markerPieces = Integer.parseInt(scanner.nextLine());
        // Препарат - 1.20 лв (за литър)
        //double cleaner = 1.20;
        //int cleanerLiters = Integer.parseInt(scanner.nextLine());
        //double total = pens*penPieces + markers*markerPieces + cleaner*cleanerLiters;
        //int percent = Integer.parseInt(scanner.nextLine());
        //double result = total - total*percent/100;
        //System.out.println(result);
    }
}
