package Basics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        switch (projection) {
            case "Premiere":
                income = rows * columns * 12.00;

                break;
            case "Normal":
                income = rows * columns * 7.50;

                break;
            case "Discount":
                income = rows * columns * 5.00;

                break;
        }
        System.out.printf("%.2f leva", income);


        //if (projection.equals("Premiere")) {
        //    income = rows * columns * 12.00;
        //    System.out.printf("%.2f", income);
        //} else if (projection.equals("Normal")) {
        //     income = rows * columns * 7.50;
        //    System.out.printf("%.2f", income);
        //} else if (projection.equals("Discount")) {
        //    income = rows * columns * 5.00;
        //    System.out.printf("%.2f", income);
        //}

    }

}
