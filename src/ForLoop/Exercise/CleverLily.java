package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double money = 0;
        double allMoney = 0;
        int toysCount = 0;
        int brother = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                allMoney = allMoney + money;
                brother++;
            } else {
                toysCount++;
            }
        }
        double toysSum = toyPrice * toysCount - brother;
        double totalMoney = allMoney + toysSum;

        double diff = Math.abs(washingMachinePrice - totalMoney);
        if (totalMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
