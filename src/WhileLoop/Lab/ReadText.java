package WhileLoop.Lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Старт
        String input = scanner.nextLine();

        // Край - булеан
        while (!input.equals("Stop")) {

            System.out.println(input);

            // Ъпдейт
            input = scanner.nextLine();
        }

    }
}
