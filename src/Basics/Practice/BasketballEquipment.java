package Basics.Practice;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double winCounter = 0;
        double lostCounter = 0;
        int diff = 0;
        int matchCounter = 0;

        while (!command.equals("End of tournaments")) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= n; i++) {
                matchCounter++;
                int teamDesi = Integer.parseInt(scanner.nextLine());
                int opponents = Integer.parseInt(scanner.nextLine());

                if (teamDesi > opponents) {
                    winCounter++;
                    diff = Math.abs(teamDesi - opponents);
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, command, diff);
                } else if (teamDesi < opponents) {
                    lostCounter++;
                    diff = Math.abs(teamDesi - opponents);
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, command, diff);
                }
            }


            command = scanner.nextLine();
        }

        double winPer = 0;
        winPer = winCounter / matchCounter * 100;
        System.out.printf("%.2f%% matches win%n", winPer);
        double lostPer = 0;
        lostPer = lostCounter / matchCounter * 100;
        System.out.printf("%.2f%% matches lost", lostPer);

    }
}
