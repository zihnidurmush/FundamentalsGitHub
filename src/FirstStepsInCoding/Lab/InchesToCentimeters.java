package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитане на вход
        double inches = Double.parseDouble(scanner.nextLine());
        // изчисления
        double centimeters = inches * 2.54;
        //принтиране на резултата
        System.out.println(centimeters);
    }
}
