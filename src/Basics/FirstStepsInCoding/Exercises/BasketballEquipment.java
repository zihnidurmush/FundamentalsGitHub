package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax = Double.parseDouble(scanner.nextLine());
        double snickersPrice = tax - (tax * 0.40);
        double uniformPrice = snickersPrice - (snickersPrice * 0.20);
        double ballPrice = uniformPrice * 1 / 4;
        double accessories = ballPrice * 1/ 5;

        double totalPrice = tax + snickersPrice + uniformPrice + ballPrice + accessories;

        System.out.println(totalPrice);

        // int taksa = Integer.parseInt(scanner.nextLine());
        // double kecove = taksa - taksa * 40 / 100;
        // double ekip = kecove - kecove * 20 / 100;
        // double ball = ekip * 1 / 4;
        // double aksesoari = ball * 1 / 5;
        // double razhodi = taksa + kecove + ekip + ball + aksesoari;
        // System.out.println(razhodi);
    }


}
