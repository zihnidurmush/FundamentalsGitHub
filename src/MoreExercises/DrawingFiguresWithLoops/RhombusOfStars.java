package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                // Print stars
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n -1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                // Print spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                // Print stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



