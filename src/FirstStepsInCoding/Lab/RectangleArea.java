package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитаме входните данни
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        // Изчисляваме лицето на правоъгълника
        int result = a * b;
        // Принтираме резултата
        System.out.println(result);
    }
}
