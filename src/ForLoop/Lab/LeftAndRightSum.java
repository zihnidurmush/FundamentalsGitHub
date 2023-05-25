package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        // Лява сума (първите n на брой числа)
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum += num;
        }

        // Дясна сума (вторите n на брой числа)
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum += num;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum -rightSum));
        }
    }
}
