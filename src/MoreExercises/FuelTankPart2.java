package MoreExercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
        String fuelType = scanner.nextLine();
        //•	Количество гориво – реално число в интервала [1.00 … 50.00]
        double liters = Double.parseDouble(scanner.nextLine());
        //•	Притежание на клубна карта – текст с възможности: "Yes" или "No"
        String memberCard = scanner.nextLine();

        double priceGasoline = 2.22;
        double priceDiesel = 2.33;
        double priceGas = 0.93;
        double sum = 0;
        double expenseBeforeDiscount;

        if (fuelType.equals("Gasoline")) {
            if (memberCard.equals("Yes")) {
                priceGasoline = priceGasoline - 0.18;
                expenseBeforeDiscount = liters * priceGasoline;
                if (liters >= 20 && liters <= 25) {
                    sum = expenseBeforeDiscount * 0.92;
                } else if (liters > 25) {
                    sum = expenseBeforeDiscount * 0.9;
                } else {
                    sum = expenseBeforeDiscount;
                }
            } else if (memberCard.equals("No")) {
                expenseBeforeDiscount = liters * priceGasoline;
                if (liters >= 20 && liters <= 25) {
                    sum = expenseBeforeDiscount * 0.92;
                } else if (liters > 25) {
                    sum = expenseBeforeDiscount * 0.9;
                } else {
                    sum = expenseBeforeDiscount;
                }
            }

        } else if (fuelType.equals("Diesel")) {
            if (memberCard.equals("Yes")) {
                priceDiesel = priceDiesel - 0.12;
                expenseBeforeDiscount = liters * priceDiesel;
                if (liters >= 20 && liters <= 25) {
                    sum = expenseBeforeDiscount * 0.92;
                } else if (liters > 25) {
                    sum = expenseBeforeDiscount * 0.9;
                } else {
                    sum = expenseBeforeDiscount;
                }
            } else if (memberCard.equals("No")) {
                expenseBeforeDiscount = liters * priceDiesel;
                if (liters >= 20 && liters <= 25) {
                    sum = expenseBeforeDiscount * 0.92;
                } else if (liters > 25) {
                    sum = expenseBeforeDiscount * 0.9;
                } else {
                    sum = expenseBeforeDiscount;
                }
            }
        } else if (fuelType.equals("Gas")) {
            if (memberCard.equals("Yes")) {
                priceGas = priceGas - 0.08;
                expenseBeforeDiscount = liters * priceGas;
                if (liters >= 20 && liters <= 25) {
                    sum = expenseBeforeDiscount * 0.92;
                } else if (liters > 25) {
                    sum = expenseBeforeDiscount * 0.9;
                } else {
                    sum = expenseBeforeDiscount;
                }
            } else if (memberCard.equals("No")) {
                expenseBeforeDiscount = liters * priceGas;
                if (liters >= 20 && liters <= 25) {
                    sum = expenseBeforeDiscount * 0.92;
                } else if (liters > 25) {
                    sum = expenseBeforeDiscount * 0.9;
                } else {
                    sum = expenseBeforeDiscount;
                }
            }
        }
        System.out.printf("%.2f lv.", sum);
    }
}


//double fuelSum = 0;
//
//        switch (fuelType) {
//            case "Gasoline":
//                switch (memberCard) {
//                    case "Yes":
//                        if (liters >= 20 && liters <= 25) {
//                            priceGasoline = (priceGasoline - 0.18) * 0.92;
//                        } else if (liters > 25) {
//                            priceGasoline = (priceGasoline - 0.18) * 0.90;
//                        }
//                        fuelSum = liters * priceGasoline;
//                        break;
//                    case "No":
//                        if (liters >= 20 && liters <= 25) {
//                            priceGasoline = priceGasoline - priceGasoline * 0.08;
//                        } else if (liters > 25) {
//                            priceGasoline = priceGasoline - priceGasoline * 0.10;
//                        }
//
//                        fuelSum = liters * priceGasoline;
//                        break;
//                }
//                break;
//            case "Diesel":
//                switch (memberCard) {
//                    case "Yes":
//                        if (liters >= 20 && liters <= 25) {
//                            priceDiesel = (priceDiesel - 0.12) * 0.92;
//                        } else if (liters > 25) {
//                            priceDiesel = (priceDiesel - 0.12) * 0.90;
//                        }
//                        fuelSum = liters * priceDiesel;
//                        break;
//                    case "No":
//                        if (liters >= 20 && liters <= 25) {
//                            priceDiesel = priceDiesel - priceDiesel * 0.08;
//                        } else if (liters > 25) {
//                            priceDiesel = priceDiesel - priceDiesel * 0.10;
//                        }
//                        fuelSum = liters * priceDiesel;
//                        break;
//                }
//                break;
//            case "Gas":
//                switch (memberCard) {
//                    case "Yes":
//                        if (liters >= 20 && liters <= 25) {
//                            priceGas = (priceGas - 0.08) * 0.92;
//                        } else if (liters > 25) {
//                            priceGas = (priceGas - 0.08) * 0.90;
//                        }
//                        fuelSum = liters * priceGas;
//                        break;
//                    case "No":
//                        if (liters >= 20 && liters <= 25) {
//                            priceGas = priceGas - priceGas * 0.08;
//                        } else if (liters > 25) {
//                            priceGas = priceGas - priceGas * 0.10;
//                        }
//
//                        fuelSum = liters * priceGas;
//                        break;
//                }
//                break;
//        }
//
//        System.out.printf("%.2f lv.", fuelSum);