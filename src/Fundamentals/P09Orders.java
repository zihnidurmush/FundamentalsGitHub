package Fundamentals;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double totalsum = 0;

        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            sum = ((days * capsules) * pricePerCapsule);
            totalsum +=sum;
            System.out.printf("The price for the coffee is: $%.2f\n", sum);
        }

        System.out.printf("Total: $%.2f", totalsum);

    }
}
