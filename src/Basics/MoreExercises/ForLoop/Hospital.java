package Basics.MoreExercises.ForLoop;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
        int period = Integer.parseInt(scanner.nextLine());
        //•	На следващите редове(равни на броят на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]
        int patients = 0;
        int treated = 0;
        int untreated = 0;
        int medics = 7;

        for (int i = 1; i <= period; i++) {
            patients = Integer.parseInt(scanner.nextLine());

            if (i % 3==0) {
                if (untreated > treated) {
                    medics++;
                }
            }

            if (patients <= medics) {
                treated += patients;
            } else {
                treated = treated + medics;
                untreated += patients - medics;
            }


        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);


    }
}
