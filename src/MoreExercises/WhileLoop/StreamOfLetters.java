package MoreExercises.WhileLoop;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.nextLine();
        boolean c = false;
        boolean o = false;
        boolean n = false;

        while (!letter.equals("End")) {
            char let = letter.charAt(0);

            if (let >= 'a' && let <= 'z') {
                if (let == 'c'){
                    c = true;
                    continue;
                }
                if (let == 'o') {
                    o = true;
                    continue;
                }
                if (let == 'n') {
                    continue;
                }
            }


            System.out.print(let);
            letter = scanner.nextLine();
        }

    }
}
