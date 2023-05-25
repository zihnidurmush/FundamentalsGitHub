package Basics.MoreExercises.ForLoop;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        int students = Integer.parseInt(scanner.nextLine());
        //•	За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]

        double grade = 0;
        int topStudent = 0;
        int goodStudent = 0;
        int avgStudent = 0;
        int failedStudent = 0;
        double avgGrade = 0;
        double totalGrades = 0;
        for (int i = 1; i <= students; i++) {
            grade = Double.parseDouble(scanner.nextLine());
            totalGrades += grade;
            if (grade >= 5) {
                topStudent++;
            } else if (grade >= 4) {
                goodStudent++;
            } else if (grade >= 3) {
                avgStudent++;
            } else {
                failedStudent++;
            }
        }

        avgGrade = totalGrades / students;
        System.out.printf("Top students: %.2f%%\n", topStudent * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodStudent * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", avgStudent * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%\n", failedStudent * 1.0 / students * 100);
        System.out.printf("Average: %.2f", avgGrade);
    }
}
