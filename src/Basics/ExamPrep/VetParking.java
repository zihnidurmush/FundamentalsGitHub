package Basics.ExamPrep;

import java.util.Scanner;

public class VetParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double fee = 0;
        double total = 0;

        for (int i = 1; i <= days; i++) {
            double feePerDay = 0;
            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) { // За всеки четен ден и нечетен час, паркингът таксува 2.50 лева.
                    fee = 2.5;

                } else if (i % 2 != 0 && j % 2 == 0) {  // всеки нечетен ден и четен час таксата е 1.25 лева
                    fee = 1.25;
                } else { // във всички останали случаи се заплаща 1 лев.
                    fee = 1;
                }

                feePerDay += fee;
            }
            total +=feePerDay;
            System.out.printf("Day: %d - %.2f leva\n", i, feePerDay);
        }
        System.out.printf("Total: %.2f leva", total);
    }
}

