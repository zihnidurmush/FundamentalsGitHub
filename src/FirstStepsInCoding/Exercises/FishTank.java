package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Дължина в см – цяло число в интервала [10 … 500]
        int length = Integer.parseInt(scanner.nextLine());
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        int width = Integer.parseInt(scanner.nextLine());
        //3.	Височина в см – цяло число в интервала [10… 200]
        int height = Integer.parseInt(scanner.nextLine());
        //4.	Процент  – реално число в интервала [0.000 … 100.000]
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInCm = length * width * height;
        double liters = volumeInCm / 1000;

        double totalLiters = liters * (1 - percent/100);

        System.out.println(totalLiters);

        // •	литрите вода, които ще събира аквариума



    }


}
