package Basics.Practice;

import java.util.Scanner;

public class BarcodeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int start = Integer.parseInt(scanner.nextLine()); //Първи ред – четирицифрено число – началото на обхвата. Цяло число
        int end = Integer.parseInt(scanner.nextLine()); //Втори ред – четирицифрено число – края на обхвата. Цяло число

        int l1 = start % 10;
        int k1 = (start / 10) % 10;
        int j1 = (start / 100) % 10;
        int i1 = start / 1000;

        int l2 = end % 10;
        int k2 = (end / 10) % 10;
        int j2 = (end / 100) % 10;
        int i2 = end / 1000;


        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                for (int k = k1; k <= k2; k++) {
                    for (int l = l1; l <= l2; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
