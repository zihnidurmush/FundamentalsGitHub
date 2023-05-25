package Basics.MoreExercises.WhileLoop;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());

        double det = bottles * 750;
        double detPerDish = 0;
        int counter = 0;
        int detAmount = 0;
        boolean noMoreDet = false;
        int placeCount = 0;
        int potCount = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int dishes = Integer.parseInt(command);
            counter++;
            if (counter % 3 == 0) {
                potCount = potCount + dishes;
                detAmount = 15;
            } else {
                placeCount += dishes;
                detAmount = 5;
            }
            detPerDish = dishes * detAmount;
            det -= detPerDish;

            if (det < 0) {
                noMoreDet = true;
                break;
            }

            command = scanner.nextLine();
        }


        if (noMoreDet) {
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(det));
        } else {
            //"Detergent was enough!"
            System.out.println("Detergent was enough!");
            //"{брой чисти чинии} dishes and {брой чисти тенджери} pots were washed."
            System.out.printf("%d dishes and %d pots were washed.%n", placeCount, potCount);
            //"Leftover detergent {количество останал препарат} ml."
            System.out.printf("Leftover detergent %.0f ml.", det);


        }

    }
}


//        //•	Брой бутилки от препарат, който ще бъде използван за миенето на чинии - цяло число в интервала [1…10]
//        String input = scanner.nextLine();
//
//        while (!input.equals("End")) {
//            int bottles = Integer.parseInt(input);
//            double detAmount = bottles * 750;
//
//            while (detAmount >= 0) {
//                int dishes = Integer.parseInt(scanner.nextLine());
//                double dishDet = dishes * 5;
//
//                detAmount -= dishDet;
//
//
//            }
//
//            input = scanner.nextLine();
//        }


//   double detInMl = 0;
//        int dishes = 0;
//        double detAmount = 0;
//        int counter = 0;
//
//        while (!input.equals("End")) {
//            int bottles = Integer.parseInt(input);
//            detInMl = bottles * 750;
//
//            while (detInMl >= 0) {
//
//                counter++;
//                if (counter % 3 == 0) {
//                    detAmount = 15;
//                    double dishSum = dishes * detAmount;
//                    detInMl = detInMl - dishes;
//                } else {
//                    detAmount = 5;
//                    double dishSum = dishes * detAmount;
//                    detInMl = detInMl - dishSum;
//
//                    dishes = Integer.parseInt(scanner.nextLine());
//                }
//            }
//
//
//            input = scanner.nextLine();
//        }

//        int counter = 0;
//        int bottle = 750;
//        double detAmount = 0;
//        double detSum = 0;
//        double diff = 0;
//        int dishes = 0;
//
//        while (!input.equals("End")) {
//            double detergent = Double.parseDouble(input);
//            dishes = Integer.parseInt(scanner.nextLine());
//            counter++;
//
//            if (counter % 3 == 0) {
//                detAmount = 15;
//            } else {
//                detAmount = 5;
//            }
//
//            detSum = dishes * detAmount;
//
//            double detAbb = bottle * detergent;
//            diff = detAbb - detSum;
//
//            dishes = Integer.parseInt(scanner.nextLine());
//        }
//
//        if (diff >= 0) {
//            System.out.println("Detergent was enough!");
//        } else {
//            System.out.printf("Not enough detergent, %.0f ml. more necessary!", diff);
//        }


//            int bottles = Integer.parseInt(input);
//            int
//            counter++;
//            detergent = bottles * bottle;
//
//            if (counter % 3 == 0) {
//                detAmount = 15;
//            } else {
//                detAmount = 5;
//            }
//            detSum =  * detAmount;
//
//            diff = detergent - detSum;
//
//        }
//        if (diff >= 0) {
//            System.out.println("Detergent was enough!");
//            System.out.printf("{брой чисти чинии} dishes and {брой чисти тенджери} pots were washed.");
//            System.out.printf("Leftover detergent %.0f ml.", diff);
//        }

