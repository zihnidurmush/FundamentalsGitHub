package ForLoop.Lab;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}















   /*     String text = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            switch (symbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
} */











       /* String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }


    }
} */














    /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i+=2) {
            double result = Math.pow(2,i);
            System.out.printf("%.0f%n", result);


        }
    }
}*/














    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }



    }
}










   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = "Hello";

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }


        //System.out.println(text.charAt(4));


    }
} */
