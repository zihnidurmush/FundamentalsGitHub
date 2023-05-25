package Basics.MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine()); //броят на закупените хризантеми – цяло число
        int rose = Integer.parseInt(scanner.nextLine()); //броят на закупените рози – цяло число
        int tulip = Integer.parseInt(scanner.nextLine()); //броят на закупените лалета – цяло число
        String season = scanner.nextLine(); //сезона – [Spring, Summer, Аutumn, Winter]
        String holidayOrNot = scanner.nextLine(); //дали денят е празник – [Y – да / N - не]

        double priceC = 0;
        double priceR = 0;
        double priceT = 0;
        double totalSum = 0;
        double chrysSum = 0;
        double roseSum = 0;
        double tulipSum = 0;

        switch (season) {
            case "Spring":
                priceC = 2;
                priceR = 4.1;
                priceT = 2.5;

                chrysSum = chrysanthemum * priceC;
                roseSum = rose * priceR;
                tulipSum = tulip * priceT;

                totalSum = chrysSum + roseSum + tulipSum;
                if (holidayOrNot.equals("Y")) {
                    totalSum = totalSum * 1.15;
                } else {
                    totalSum = totalSum;
                }
                if (tulip > 7) {
                    totalSum = totalSum * 0.95;
                }
                if (chrysanthemum + rose + tulip > 20) {
                    totalSum = totalSum * 0.8;
                }
                break;
            case "Summer":
                priceC = 2;
                priceR = 4.1;
                priceT = 2.5;

                chrysSum = chrysanthemum * priceC;
                roseSum = rose * priceR;
                tulipSum = tulip * priceT;

                totalSum = chrysSum + roseSum + tulipSum;
                if (holidayOrNot.equals("Y")) {
                    totalSum = totalSum * 1.15;
                } else {
                    totalSum = totalSum;
                }
                if (chrysanthemum + rose + tulip > 20) {
                    totalSum = totalSum * 0.8;
                }
                break;
            case "Autumn":
                priceC = 3.75;
                priceR = 4.5;
                priceT = 4.15;
                chrysSum = chrysanthemum * priceC;
                roseSum = rose * priceR;
                tulipSum = tulip * priceT;

                totalSum = chrysSum + roseSum + tulipSum;
                if (holidayOrNot.equals("Y")) {
                    totalSum = totalSum * 1.15;
                } else {
                    totalSum = totalSum;
                }
                if (chrysanthemum + rose + tulip > 20) {
                    totalSum = totalSum * 0.8;
                }
                break;
            case "Winter":
                priceC = 3.75;
                priceR = 4.5;
                priceT = 4.15;
                chrysSum = chrysanthemum * priceC;
                roseSum = rose * priceR;
                tulipSum = tulip * priceT;

                totalSum = chrysSum + roseSum + tulipSum;
                if (holidayOrNot.equals("Y")) {
                    totalSum = totalSum * 1.15;
                } else {
                    totalSum = totalSum;
                }
                if (rose >= 10) {
                    totalSum = totalSum * 0.9;
                }
                if (chrysanthemum + rose + tulip > 20) {
                    totalSum = totalSum * 0.8;
                }
                break;
        }
        double bouquet = totalSum + 2;
        System.out.printf("%.2f", bouquet);
    }
}
