package Practice;

import java.util.Scanner;

public class NoNoNoGameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfFirstPlayer = scanner.nextLine();
        String nameOfSecondPlayer = scanner.nextLine();

        String command = scanner.nextLine();
        int countPointsOf1 = 0;
        int countPointsOf2 = 0;
        boolean isNW = false;

        while (!command.equals("End of game")) {

            int card1 = Integer.parseInt(command);
            int card2 = Integer.parseInt(scanner.nextLine());

            if (card1 > card2) {
                int diff = Math.abs(card1 - card2);
                countPointsOf1 = countPointsOf1 + diff;
            } else if (card1 < card2) {
                int diff = Math.abs(card1 - card2);
                countPointsOf2 = countPointsOf2 + diff;
            } else {
                isNW = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (isNW) {
            System.out.println("Number wars!");
            if (countPointsOf1 > countPointsOf2) {
                System.out.printf("%s is winner with %d points", nameOfFirstPlayer, countPointsOf1);
            } else if (countPointsOf1 < countPointsOf2) {
                System.out.printf("%s is winner with %d points", nameOfSecondPlayer, countPointsOf2);
            }

        } else {

            System.out.printf("%s has %d points%n", nameOfFirstPlayer, countPointsOf1);
            System.out.printf("%s has %d points", nameOfSecondPlayer, countPointsOf2);
        }
    }
}
