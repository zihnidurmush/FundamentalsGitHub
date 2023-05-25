package NestedLoops.Lab;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) /*throws InterruptedException*/ {
        Scanner scanner = new Scanner(System.in);

        // Цикъл по часове
        for (int i = 0; i < 24; i++) {
            // Цикъл по минутти
            for (int j = 0; j < 60; j++) {

                System.out.printf("%d:%d\n", i, j);

            }
        }
    }
}

//for (int h = 0; h < 24; h++) {
//        // Цикъл по минутти
//        for (int m = 0; m < 60; m++) {
//        Thread.sleep(1000); добавя брояч на секунди
//        System.out.printf("%02d:%02d\n", h, m);
//
//        }
//        }