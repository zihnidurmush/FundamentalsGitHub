package Basics.WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();

        boolean theBookIsFound = false;
        int bookCounter = 0;
        String command = scanner.nextLine(); //book or "No More Books"

        while (!command.equals("No More Books")) {
            String currentBook = command;

            if (currentBook.equals(wantedBook)) {
                theBookIsFound = true;
                break;
            }
            bookCounter++;

            command = scanner.nextLine();
        }

        if (theBookIsFound) {
            System.out.printf("You checked %d books and found it.", bookCounter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCounter);
        }
    }
}
