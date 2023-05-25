package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int cols = 0; cols < row; cols++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
