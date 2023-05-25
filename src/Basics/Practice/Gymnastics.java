package Basics.Practice;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine(); //държава – ("Russia", "Bulgaria" или "Italy")
        String equipment = scanner.nextLine(); //уред - ("ribbon", "hoop" или "rope")
        double difficulty = 0;
        double execution = 0;
        double avgGrade = 0;
        double remaining = 0;


        switch (country) {
            case "Russia":
                switch (equipment) {
                    case "ribbon":
                        difficulty = 9.100;
                        execution = 9.400;
                        break;
                    case "hoop":
                        difficulty = 9.300;
                        execution = 9.800;
                        break;
                    case "rope":
                        difficulty = 9.600;
                        execution = 9.000;
                        break;
                }
                break;
            case "Bulgaria":
                switch (equipment) {
                    case "ribbon":
                        difficulty = 9.600;
                        execution = 9.400;
                        break;
                    case "hoop":
                        difficulty = 9.550;
                        execution = 9.750;
                        break;
                    case "rope":
                        difficulty = 9.500;
                        execution = 9.400;
                        break;
                }
                break;
            case "Italy":
                switch (equipment) {
                    case "ribbon":
                        difficulty = 9.200;
                        execution = 9.500;
                        break;
                    case "hoop":
                        difficulty = 9.450;
                        execution = 9.350;
                        break;
                    case "rope":
                        difficulty = 9.700;
                        execution = 9.150;
                        break;
                }
                break;
        }
        avgGrade = (difficulty + execution);
        remaining = 20 - avgGrade;
        double percentage = (remaining / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, avgGrade, equipment);
        System.out.printf("%.2f%%", percentage);
    }
}
