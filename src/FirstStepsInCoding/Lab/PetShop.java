package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //храна за кучета = 2.50 лв.
        double a = Double.parseDouble(scanner.nextLine());
        //храна за котки = 4 лв.
        double b = Double.parseDouble(scanner.nextLine());
        double result = a * 2.5 + b * 4;
        // изход: "{крайната сума} lv."
        System.out.printf("%.2f lv.", result);
    }
}
