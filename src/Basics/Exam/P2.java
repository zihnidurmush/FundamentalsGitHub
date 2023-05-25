package Basics.Exam;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthOfShip = Double.parseDouble(scanner.nextLine()); //широчината на кораба - реално число
        double lengthOfShip = Double.parseDouble(scanner.nextLine()); //дължината на кораба - реално число
        double heightOfShip = Double.parseDouble(scanner.nextLine()); //височината на кораба - реално число
        double avgHeightOfAstro = Double.parseDouble(scanner.nextLine());  //средната височина на астронавтите  -  реално число

        double shipVolume = widthOfShip * lengthOfShip * heightOfShip;
        double roomVolume = (avgHeightOfAstro + 0.40) * 2 * 2;

        double availableSpace = Math.floor(shipVolume / roomVolume);

        if (availableSpace >= 3 && availableSpace <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", availableSpace);
        } else if (availableSpace < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (availableSpace > 10) {
            System.out.println("The spacecraft is too big.");
        }


    }
}
