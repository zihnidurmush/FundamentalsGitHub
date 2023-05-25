package Basics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine()); //височината на къщата
        double y = Double.parseDouble(scanner.nextLine()); //дължината на страничната стена
        double h = Double.parseDouble(scanner.nextLine()); //височината на триъгълната стена на прокрива

        double wallArea = (x * x - 1.2 * 2) + x * x + (x * y  - 1.5 * 1.5) * 2;
        //double area = a * h / 2;
        double roofArea = x * y * 2 + (x * h / 2) * 2;

        double paintingWall = wallArea / 3.4;
        double paintingRoof = roofArea / 4.3;

        System.out.printf("%.2f%n" +
                "%.2f",paintingWall,paintingRoof);


    }
}
