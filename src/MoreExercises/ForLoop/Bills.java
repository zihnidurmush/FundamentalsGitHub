package MoreExercises.ForLoop;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – месеците за които се търси средният разход – цяло число в интервала [1...100]
        int months = Integer.parseInt(scanner.nextLine());
        //•	За всеки месец – сметката за ток – реално число в интервала [1.00...1000.00]

        double elBill = 0;
        double elTotal = 0;
        double waterBill = 0;
        double internetBill = 0;
        double otherBills = 0;
        double totalBills = 0;
        double avg = 0;

        for (int i = 1; i <= months; i++) {
            elBill = Double.parseDouble(scanner.nextLine());
            elTotal += elBill;
            waterBill = months * 20;
            internetBill = months * 15;

        }
        otherBills = (elTotal + waterBill + internetBill) * 1.2;
        totalBills = elTotal + waterBill + internetBill + otherBills;

        avg = totalBills / months;


        System.out.printf("Electricity: %.2f lv\n", elTotal);
        System.out.printf("Water: %.2f lv\n", waterBill);
        System.out.printf("Internet: %.2f lv\n", internetBill);
        System.out.printf("Other: %.2f lv\n", otherBills);
        System.out.printf("Average: %.2f lv\n", avg);


    }
}
