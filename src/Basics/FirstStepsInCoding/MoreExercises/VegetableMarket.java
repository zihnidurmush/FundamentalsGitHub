package Basics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double sumVegetable = priceVegetables * kgVegetables;
        double sumFruits = priceFruits * kgFruits;

        double totalsum = (sumVegetable + sumFruits) / 1.94;

        System.out.printf("%.2f", totalsum);

    }
}
