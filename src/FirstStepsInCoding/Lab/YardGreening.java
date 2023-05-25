package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        double area = Double.parseDouble(scanner.nextLine());
        // Изчисление
        // Цената на един кв. м. е 7.61 лв. с ДДС
        double result = area * 7.61;
        // 18% отстъпка от крайната цена
        double discount = result * 0.18;
        double total = result - discount;
        // Принтиране
        System.out.printf("The final price is: %.2f lv. %n" , total);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
