package Practice;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWindows = Integer.parseInt(scanner.nextLine()); //Брой дограми – цяло число
        String windowsType = scanner.nextLine(); //Вид на дограмите – текст "90X130", "100X150", "130X180", "200X300";
        String deliverType = scanner.nextLine(); //Начин на получаване – текст "With delivery", "Without delivery"
        double windowsPrice = 0;
        double discount = 0;
        double sumWithoutDiscount = 0;
        double discountedPrice = 0;
        boolean isValid = false;

        if (numberOfWindows < 10) {
            isValid = true;
        }


        switch (windowsType) {
            case "90X130":
                windowsPrice = 110;
                if (numberOfWindows > 30 && numberOfWindows < 60) {
                    discount = 0.05;
                } else if (numberOfWindows > 60) {
                    discount = 0.08;
                }
                break;
            case "100X150":
                windowsPrice = 140;
                if (numberOfWindows > 40 && numberOfWindows < 80) {
                    discount = 0.06;
                } else if (numberOfWindows > 80) {
                    discount = 0.10;
                }
                break;
            case "130X180":
                windowsPrice = 190;
                if (numberOfWindows > 20 && numberOfWindows < 50) {
                    discount = 0.07;
                } else if (numberOfWindows > 50) {
                    discount = 0.12;
                }
                break;
            case "200X300":
                windowsPrice = 250;
                if (numberOfWindows > 25 && numberOfWindows < 50) {
                    discount = 0.09;
                } else if (numberOfWindows > 50) {
                    discount = 0.14;
                }
                break;

        }
        if (deliverType.equals("With delivery")) {
            sumWithoutDiscount = numberOfWindows * windowsPrice;
            discountedPrice = (sumWithoutDiscount - sumWithoutDiscount * discount) + 60;
            if (numberOfWindows > 99) {
                discountedPrice = discountedPrice - discountedPrice * 0.04;
            }
        } else if (deliverType.equals("Without delivery")) {
            sumWithoutDiscount = numberOfWindows * windowsPrice;
            discountedPrice = sumWithoutDiscount - sumWithoutDiscount * discount;
            if (numberOfWindows > 99) {
                discountedPrice = discountedPrice - discountedPrice * 0.04;
            }
        }
        if (isValid) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", discountedPrice);
        }

    }
}
