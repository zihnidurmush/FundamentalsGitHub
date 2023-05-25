package Basics.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    if (j == 1 || j == n) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("- ");
                    }
                } else {
                    if (j == 1 || j == n) {
                        System.out.print("| ");
                    } else {
                        System.out.print("- ");
                    }
                }
            }
            System.out.println();
        }
    }
}

//}
//            if (i != 1 || i != n) {
//                System.out.print("|");
//            } else {
//                System.out.print("-");
//            }