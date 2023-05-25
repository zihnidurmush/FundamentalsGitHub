package Basics.Practice;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //броят на посетителите във фитнеса

        int countBack = 0;
        int countChest = 0;
        int countLegs = 0;
        int countAbs = 0;
        int countProteinShake = 0;
        int countProteinBar = 0;
        int training = 0;
        int protein = 0;


        for (int i = 0; i < n; i++) {
            String activity = scanner.nextLine(); // дейността - "Back", "Chest", "Legs", "Abs", "Protein shake", "Protein bar"
            switch (activity) {
                case "Back":
                    countBack++;
                    training++;
                    break;
                case "Chest":
                    countChest++;
                    training++;
                    break;
                case "Legs":
                    countLegs++;
                    training++;
                    break;
                case "Abs":
                    countAbs++;
                    training++;
                    break;
                case "Protein shake":
                    countProteinShake++;
                    protein++;
                    break;
                case "Protein bar":
                    countProteinBar++;
                    protein++;
                    break;
            }

        }
        System.out.printf("%d - back%n", countBack); //гръб - back
        System.out.printf("%d - chest%n", countChest); //гърди - chest
        System.out.printf("%d - legs%n", countLegs); //крака - legs
        System.out.printf("%d - abs%n", countAbs); //коремни мускули} - abs
        System.out.printf("%d - protein shake%n", countProteinShake); //протеинов шейк} - protein shake
        System.out.printf("%d - protein bar%n", countProteinBar); //протеинов блок} - protein bar

        double percentageForTraining = 0;
        percentageForTraining = training * 1.0 / n * 100;
        double percentageForProtein = 0;
        percentageForProtein = protein * 1.0 / n * 100;

        System.out.printf("%.2f%% - work out%n", percentageForTraining);
        //Ред 7 -	"{процент на хората дошли да тренират}% - work out"
        System.out.printf("%.2f%% - protein", percentageForProtein);
        //Ред 8 -	"{процент на хората дошли да купят протеин}% - protein"



    }
}
