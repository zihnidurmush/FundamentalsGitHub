package Basics.Exam;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        double anticipatedPerDay = 0;
        int days = 0;
        double excavationPerDay = 0;
        double avgPerDay = 0;

        for (int i = locations; i > 0; i--) {

            anticipatedPerDay = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());

            double totalExtraction = 0;


            for (int j = days; j > 0; j--) {
                excavationPerDay = Double.parseDouble(scanner.nextLine());

                totalExtraction += excavationPerDay;
                avgPerDay = totalExtraction / days;

            }


            if (avgPerDay >= anticipatedPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avgPerDay);
            } else {
                double diff = anticipatedPerDay - avgPerDay;
                System.out.printf("You need %.2f gold.%n", diff);
            }
        }


    }
}


//int locations = Integer.parseInt(scanner.nextLine());
//        double avgYield = 0;
//        int days = 0;
//        double avgPerDay = 0;
//        for (int i = 0; i < locations; i++) {
//
//            avgPerDay = Double.parseDouble(scanner.nextLine()); //очакван среден добив на ден злато – реално число
//            days = Integer.parseInt(scanner.nextLine()); //брой дни, в който ще се копае на дадената локация – цяло число
//            double totalYield = 0;
//            for (int j = 0; j < days; j++) {
//                double currentYield = Double.parseDouble(scanner.nextLine());
//                totalYield += currentYield;
//
//                avgYield = totalYield / days;
//            }
//            double diff = Math.abs(avgPerDay - avgYield);
//            if (avgYield >= avgPerDay) {
//                System.out.printf("Good job! Average gold per day: %.2f.\n", avgYield);
//            } else {
//                System.out.printf("You need %.2f gold.", diff);
//            }
//        }