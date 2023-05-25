package Practice;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine()); // Минути на контролата
        int seconds = Integer.parseInt(scanner.nextLine()); //Секунди на контролата
        double meters = Double.parseDouble(scanner.nextLine()); //Дължината на улея в метри
        int secondsPer100m = Integer.parseInt(scanner.nextLine()); //Секунди за изминаване на 100 метра

        int controlInSeconds = minutes * 60 + seconds;
        double delayPer120m = meters / 120;
        double totalDelay = delayPer120m * 2.5;

        double timeOfSportsman = (meters / 100) * secondsPer100m - totalDelay;
        double diff = Math.abs(timeOfSportsman - controlInSeconds);

        if (timeOfSportsman <= controlInSeconds) {
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.", timeOfSportsman);
        } else if (timeOfSportsman > controlInSeconds) {
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);
        }
    }
}
