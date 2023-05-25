package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class mMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int price = Integer.parseInt(scanner.nextLine());


        // 20% отстъпка в Понеделник, ако сумата е > 100 лв.
        if (day.equals("Monday")) {

            if (price > 100) {
                System.out.println("You get 20% discount");
            }
        } else {
            System.out.println("You will get discount only on Monday");
        }
    }
}
