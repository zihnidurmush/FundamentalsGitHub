package Exam;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine(); //месецът - текст с възможности: "march", "april", "may", "june", "july", "august"
        int hoursSpend = Integer.parseInt(scanner.nextLine()); //броят на прекараните часове - цяло число
        int peopleInGroup = Integer.parseInt(scanner.nextLine()); //броят на хората в групата -  цяло число
        String timeOfDay = scanner.nextLine(); //времето от деня – текст с възможности: "day" или "night"

        double price = 0;

        switch (month) {
            case "march":
                switch (timeOfDay) {
                    case "day":
                        price = 10.50;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                    case "night":
                        price = 8.40;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                }
                break;
            case "april":
                switch (timeOfDay) {
                    case "day":
                        price = 10.50;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                    case "night":
                        price = 8.40;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                }
                break;
            case "may":
                switch (timeOfDay) {
                    case "day":
                        price = 10.50;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                    case "night":
                        price = 8.40;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                }
                break;
            case "june":
                switch (timeOfDay) {
                    case "day":
                        price = 12.60;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                    case "night":
                        price = 10.20;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                }
                break;
            case "july":
                switch (timeOfDay) {
                    case "day":
                        price = 12.60;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                    case "night":
                        price = 10.20;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                }
                break;
            case "august":
                switch (timeOfDay) {
                    case "day":
                        price = 12.60;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                    case "night":
                        price = 10.20;
                        if (peopleInGroup >= 4) {
                            price = price * 0.9;
                        }
                        if (hoursSpend >= 5) {
                            price = price * 0.5;
                        }
                        break;
                }
                break;
        }
        double totalSum = (price * peopleInGroup) * hoursSpend;



        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", totalSum);
    }
}


//switch (month) {
//            case "march":
//                switch (timeOfDay) {
//                    case "day":
//                        price = 10.50;
//                        if (peopleInGroup >= 4) {
//                            price = price * 0.90;
//                        }
//                        if (hoursSpend >= 5) {
//                            price = price * 0.50;
//                        }
//                        break;
//                    case "night":
//                        price = 8.40;
//                        if (peopleInGroup >= 4) {
//                            price = price * 0.90;
//                        }
//                        if (hoursSpend >= 5) {
//                            price = price * 0.50;
//                        }
//                        break;
//                }
//            case "june", "july", "august":
//                switch (timeOfDay) {
//                    case "day":
//                        price = 12.60;
//                        if (peopleInGroup >= 4) {
//                            price = price * 0.90;
//                        }
//                        if (hoursSpend >= 5) {
//                            price = price * 0.50;
//                        }
//                        break;
//                    case "night":
//                        price = 10.20;
//                        if (peopleInGroup >= 4) {
//                            price = price * 0.90;
//                        }
//                        if (hoursSpend >= 5) {
//                            price = price * 0.50;
//                        }
//                        break;
//                }
//        }
//
//        double totalSum = (price * peopleInGroup) * hoursSpend;
//
//        System.out.println(totalSum);