package Exam;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Годините на всеки член от семейството - цяло число в интервала [1 … 130]
        String input = scanner.nextLine();

        int kidsCounter = 0;
        int adultCounter = 0;
        double toyPrice = 5;
        double pullOverPrice = 15;
        double priceForKids = 0;
        double priceForAdults = 0;

        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(input);
            if (age <= 16) {
                kidsCounter++;

            } else {
                adultCounter++;

            }
            input = scanner.nextLine();
        }
        priceForKids = toyPrice * kidsCounter;
        priceForAdults = pullOverPrice * adultCounter;

        //•	"Number of adults: {брой хора над 16 години}"
        System.out.printf("Number of adults: %d%n", adultCounter);
        //•	"Number of kids: {брой хора до 16 (вкл.) години}"
        System.out.printf("Number of kids: %d%n", kidsCounter);
        //•	"Money for toys: {сумата за всички играчки}"
        System.out.printf("Money for toys: %.0f%n", priceForKids);
        //•	"Money for sweaters: {сума за всички пуловери}"
        System.out.printf("Money for sweaters: %.0f%n", priceForAdults);
    }
}
