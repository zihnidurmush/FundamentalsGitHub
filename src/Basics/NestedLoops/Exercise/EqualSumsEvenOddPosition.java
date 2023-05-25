package Basics.NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            int currentNumber = i;

            int evenSum = 0;
            int oddSum = 0;

            for (int j = 6; j >= 1; j--) {
                int digit = currentNumber % 10;
                if (j % 2 == 0) {
                    evenSum = evenSum + digit;
                } else {
                    oddSum = oddSum + digit;
                }
                currentNumber = currentNumber / 10;
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }


    }
}


//    int firstNum = Integer.parseInt(scanner.nextLine());
//        int secondNum = Integer.parseInt(scanner.nextLine());
//
//        for (int i = firstNum; i <= secondNum; i++) {
//            String currentNum = "" + i;
//            int oddSum = 0;
//            int evenSum = 0;
//
//            for (int j = 0; j < currentNum.length(); j++) {
//                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
//                if (j % 2 == 0) {
//                    evenSum += currentDigit;
//                } else {
//                    oddSum += currentDigit;
//                }
//            }
//            if (oddSum == evenSum) {
//                System.out.print(i + " ");
//            }
//        }
