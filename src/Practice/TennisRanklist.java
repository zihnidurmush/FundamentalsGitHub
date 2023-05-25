package Practice;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTours = Integer.parseInt(scanner.nextLine()); //Брой турнири
        int initialPoints = Integer.parseInt(scanner.nextLine()); //Начален брой точки в ранглистата

        int pointsEarned = 0;
        int sumOfPoints = 0;
        int avgPoints = 0;
        int winCounter = 0;
        int finalPoints = 0;

        for (int i = 1; i <= numberOfTours; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    winCounter++;
                    pointsEarned = 2000;
                    break;
                case "F":
                    pointsEarned = 1200;
                    break;
                case "SF":
                    pointsEarned = 720;
                    break;
            }
            sumOfPoints = sumOfPoints + pointsEarned;
        }
        finalPoints = sumOfPoints + initialPoints;
        avgPoints = sumOfPoints / numberOfTours;
        double percentage = 0;
        percentage = winCounter * 1.0 / numberOfTours * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", avgPoints);
        System.out.printf("%.2f%%", percentage);



    }
}
