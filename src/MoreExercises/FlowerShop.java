package MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine()); //Брой магнолии – цяло число
        int hyacinth = Integer.parseInt(scanner.nextLine()); //Брой зюмбюли – цяло число
        int rose = Integer.parseInt(scanner.nextLine()); //Брой рози – цяло число
        int cactus = Integer.parseInt(scanner.nextLine()); //Брой кактуси – цяло число
        double giftPrice = Double.parseDouble(scanner.nextLine()); //Цена на подаръка – реално число

        double priceM = 3.25;
        double priceH = 4;
        double priceR = 3.50;
        double priceC = 8;


        double sum = magnolia * priceM + hyacinth * priceH + rose * priceR + cactus * priceC;
        double tax = sum * 0.05;

        double profit = sum - tax;
        double diff = Math.abs(profit - giftPrice);

        if (profit >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }


    }
}
