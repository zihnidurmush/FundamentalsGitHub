package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < num) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            sum += currentNumber;

        }
        System.out.println(sum);

    }
}
