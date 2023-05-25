package Basics.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
        int km = Integer.parseInt(scanner.nextLine());
        //•	Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта
        String dayTime = scanner.nextLine();
        double sum = 0;
        double initialFee = 0.7;

        if (km < 20) {
            switch (dayTime) {
                case "day":
                    sum = initialFee + (km * 0.79);
                    break;
                case "night":
                    sum = initialFee + (km * 0.90);
                    break;
            }

        } else if (km >= 20 && km < 100) {
            switch (dayTime) {
                case "day":
                    sum = km * 0.09;
                    break;
                case "night":
                    sum = km * 0.09;
                    break;
            }
            } else{
                switch (dayTime) {
                    case "day":
                        sum = km * 0.06;
                        break;
                    case "night":
                        sum = km * 0.06;
                        break;

                }

            }
                System.out.printf("%.2f", sum);
        }
    }
