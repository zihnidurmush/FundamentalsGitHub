package Basics.MoreExercises.ForLoop;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int n1 = 0;
        int n2 = 0;
        int digit = 0;

        for (int i = 1; i <= n; i++) {
            n1 = Integer.parseInt(scanner.nextLine());
            n2 = Integer.parseInt(scanner.nextLine());

            digit = n1 + n2;


        }

    }
}

//https://judge.softuni.org/Contests/Practice/Index/1680#7

// Дадени са 2*n-на брой числа. Първото и второто формират двойка, третото и четвъртото също и т.н. Всяка двойка има стойност – сумата от съставящите я числа. Напишете програма, която проверява дали всички двойки имат еднаква стойност или печата максималната разлика между две последователни двойки. Ако всички двойки имат еднаква стойност, отпечатайте "Yes, value={Value}" + стойността. В противен случай отпечатайте "No, maxdiff={Difference}" + максималната разлика.