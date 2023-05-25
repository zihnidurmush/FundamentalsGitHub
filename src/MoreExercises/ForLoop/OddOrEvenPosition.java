package MoreExercises.ForLoop;

import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double num = 0;
        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {

            num = Double.parseDouble(scanner.nextLine());


            if (i % 2 == 0) {
                evenSum += num;
                if (evenMax < num) {
                    evenMax = num;
                }
                if (evenMin > num) {
                    evenMin = num;
                }
            }
            if (i % 2 != 0) {
                oddSum += num;
                if (oddMax < num) {
                    oddMax = num;
                }
                if (oddMin > num) {
                    oddMin = num;
                }
            }
        }
        System.out.printf("OddSum=" + "%.2f,\n", oddSum);
        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=" + "%.2f,\n", oddMin);
        }
        if (oddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=" + "%.2f,\n", oddMax);
        }
        System.out.printf("EvenSum=" + "%.2f,\n", evenSum);
        if (evenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=" + "%.2f,\n", evenMin);
        }
        if (evenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=" + "%.2f\n", evenMax);
        }
    }
}
