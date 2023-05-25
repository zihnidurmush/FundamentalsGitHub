package Basics.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред –  в интервал [1…5000]
        int days = Integer.parseInt(scanner.nextLine());
        //•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
        int foodKg = Integer.parseInt(scanner.nextLine());
        //•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        //•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        //•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
        double turtleFoodPerDayInGrams = Double.parseDouble(scanner.nextLine());

        double dogFood = days * dogFoodPerDay;
        double catFood = days * catFoodPerDay;
        double turtleFood = days * turtleFoodPerDayInGrams / 1000;

        double totalFood = dogFood + catFood + turtleFood;


        if (foodKg > totalFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood-foodKg));
        }

    }
}
