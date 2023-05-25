package MoreExercises.While;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double i = Double.parseDouble(scanner.nextLine());

        while (i >= 0) {

            i = i * 2;

            System.out.printf("Result: %.2f%n", i);
        i = Double.parseDouble(scanner.nextLine());
        }

        if (i < 0) {
            System.out.println("Negative number!");
        }
    }
}

