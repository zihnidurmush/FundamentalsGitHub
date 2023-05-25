package Basics.WhileLoop.Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width * length;

        String command = scanner.nextLine();
        boolean noMorePieces = false;
        while (!command.equals("STOP")) {

            int piecesTaken = Integer.parseInt(command);
            pieces = pieces - piecesTaken;
            if (pieces < 0) {
                noMorePieces = true;
                break;
            }
            command = scanner.nextLine();

        }
        if (noMorePieces) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        } else {
            System.out.printf("%d pieces are left.", pieces);
        }


    }
}
