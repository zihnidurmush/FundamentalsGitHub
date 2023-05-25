package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
           // Намиране на максимално число
            if (maxNumber < num) {
                maxNumber = num;
            }
            // Намиране на минимално число
            if (minNumber > num) {
                minNumber = num;
            }
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);

    }
}
