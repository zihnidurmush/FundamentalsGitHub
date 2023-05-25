package Basics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        // Лице на кръга=π⋅радиус2
        double sArea = Math.PI * r * r;

        double pArea = 2 * Math.PI * r;

        System.out.printf("%.2f%n" +
                "%.2f", sArea, pArea);

    }
}
