package Fundamentals.P02DataTypesAndVariablesLab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pounds = Float.parseFloat(scanner.nextLine());

        float dollars = pounds * 1.36f;

        System.out.println(String.format("%.3f", dollars));
    }
}
