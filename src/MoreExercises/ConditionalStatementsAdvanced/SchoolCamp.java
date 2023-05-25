package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine(); //Сезонът – текст - “Winter”, “Spring” или “Summer”;
        String groupType = scanner.nextLine(); //Видът на групата – текст - “boys”, “girls” или “mixed”;
        int students = Integer.parseInt(scanner.nextLine()); //Брой на учениците – цяло число
        int nights = Integer.parseInt(scanner.nextLine()); //Брой на нощувките – цяло число

        double price = 0;
        String sportType = "";
        double allPrice = 0;

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        price = 9.6;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Judo";
                        break;
                    case "girls":
                        price = 9.6;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Gymnastics";
                        break;
                    case "mixed":
                        price = 10;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                        price = 7.2;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Tennis";
                        break;
                    case "girls":
                        price = 7.2;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Athletics";
                        break;
                    case "mixed":
                        price = 9.50;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                        price = 15;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Football";
                        break;
                    case "girls":
                        price = 15;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Volleyball";
                        break;
                    case "mixed":
                        price = 20;
                        if (students >= 50) {
                            price = price * 0.5;
                        } else if (students >= 20) {
                            price = price * 0.85;
                        } else if (students >= 10) {
                            price = price * 0.95;
                        }
                        sportType = "Swimming";
                        break;
                }
                break;
        }
        allPrice = students * price * nights;
        System.out.printf("%s %.2f lv.", sportType, allPrice);
    }
}
