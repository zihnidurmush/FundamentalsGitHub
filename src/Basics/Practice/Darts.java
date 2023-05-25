package Basics.Practice;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String command = scanner.nextLine();
        int startingPoints = 301;
        int countSuccessfulShot = 0;
        int countUnsuccessfulShot = 0;
        boolean isZero = false;
        boolean isRetire = false;

        while (startingPoints > 0) {
            String sector = command;
            if (command.equals("Retire")) {
                isRetire = true;
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());
            switch (sector) {
                case "Single":
                    break;
                case "Double":
                    points = points * 2;
                    break;
                case "Triple":
                    points = points * 3;
                    break;
            }
            if (startingPoints >= points) {
                countSuccessfulShot++;
                startingPoints = startingPoints - points;
                if (startingPoints == 0) {
                    isZero = true;
                    break;
                }
            } else {
                countUnsuccessfulShot++;

            }

            command = scanner.nextLine();
        }

        if (isZero) {
            System.out.printf("%s won the leg with %d shots.", name, countSuccessfulShot);
        } else if (isRetire){
            System.out.printf("%s retired after %d unsuccessful shots.", name, countUnsuccessfulShot);
        }
        }
}
