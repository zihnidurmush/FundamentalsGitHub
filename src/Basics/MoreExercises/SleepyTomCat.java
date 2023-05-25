package Basics.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int offDays = Integer.parseInt(scanner.nextLine());

        int minsInOffDays = offDays * 127;
        int minsInWorkDays = (365 - offDays) * 63;
        int sum = minsInOffDays + minsInWorkDays;


        if (sum > 30000) {
            int diff = Math.abs(30000 - sum) ;
            int hoursM = diff / 60;
            int minsM = diff % 60;

            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hoursM, minsM);


        } else if (sum < 30000) {
            int hoursAndMins = 30000 - sum;
            int hour = hoursAndMins / 60;
            int minutes = hoursAndMins % 60;

            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hour, minutes);
        }


    }
}
