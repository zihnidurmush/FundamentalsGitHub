package Basics.MoreExercises.WhileLoop;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double avg = 0;


        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            sum += number;
            avg = sum / n;


        }
        System.out.printf("%.2f", avg);

    }
}
