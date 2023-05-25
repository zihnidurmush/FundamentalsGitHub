package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());

        int countAllProblems = 0;
        double totalGrades = 0;
        int countBadGrades = 0;
        String lastProblem = "";
        boolean needBreak = false;

        String command = scanner.nextLine();

        while (!command.equals("Enough")) {
            String currentProblem = command;
            int grade = Integer.parseInt(scanner.nextLine());
            lastProblem = currentProblem;
            countAllProblems++;

            if (grade <= 4) {
                countBadGrades++;
            }

            totalGrades = totalGrades + grade;

            if (countBadGrades >= maxBadGrades) {
                needBreak = true;
                break;
            }

            command = scanner.nextLine();
        }

        double averageGrades = totalGrades / countAllProblems;

        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", countBadGrades);
        } else {
            System.out.printf("Average score: %.2f%n", averageGrades);
            System.out.printf("Number of problems: %d%n", countAllProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }


    }
}
