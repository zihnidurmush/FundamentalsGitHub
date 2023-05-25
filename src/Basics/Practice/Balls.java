package Basics.Practice;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //От конзолата се чете 1 цяло число N, което е броят на топките
        double totalPoints = 0;
        int redCounter = 0;
        int orangeCounter = 0;
        int yellowCounter = 0;
        int whiteCounter = 0;
        int blackCounter = 0;
        int otherCounter = 0;


        for (int i = 0; i < n; i++) {
            String colors = scanner.nextLine();
            if (colors.equals("red")) {
                redCounter++;
                totalPoints = totalPoints + 5;
            } else if (colors.equals("orange")) {
                orangeCounter++;
                totalPoints = totalPoints + 10;
            } else if (colors.equals("yellow")) {
                yellowCounter++;
                totalPoints = totalPoints + 15;
            } else if (colors.equals("white")) {
                whiteCounter++;
                totalPoints = totalPoints + 20;
            } else if (colors.equals("black")) {
                blackCounter++;
                totalPoints = Math.floor(totalPoints / 2);
            } else {
                otherCounter++;
            }
        }


        System.out.printf("Total points: %.0f%n", totalPoints); //"Total points: {всичките събрани точки}"
        System.out.printf("Red balls: %d%n", redCounter); //"Red balls: {броят червени топки}"
        System.out.printf("Orange balls: %d%n", orangeCounter); //"Orange balls: {броят оранжеви топки}"
        System.out.printf("Yellow balls: %d%n", yellowCounter); //"Yellow balls: {броят жълти топки}"
        System.out.printf("White balls: %d%n", whiteCounter); //"White balls: {броят бели топки}"
        System.out.printf("Other colors picked: %d%n", otherCounter);//"Other colors picked: {броят на избраните топки извън зададените цветове}"
        System.out.printf("Divides from black balls: %d", blackCounter);//"Divides from black balls: {броят на пътите, в които точките са били разделяни на 2}"
    }
}
