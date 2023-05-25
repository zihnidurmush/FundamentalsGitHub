package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //int double String char
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double apples = Double.parseDouble(scanner.nextLine());

        System.out.printf("My name is: %s%n", name);
        System.out.printf("I'm %d years old.%n", age);
        System.out.printf("Apples available - %f", apples);

    }
}
