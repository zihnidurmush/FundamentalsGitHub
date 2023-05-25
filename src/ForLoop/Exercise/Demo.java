package ForLoop.Exercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String name = scanner.nextLine();

        // Започваме пазаруване
        // до достигане на команда "Stop" прочитаме дреха и цената и от конзолата
        //приключва до достигане на команда "Stop" или ако наличните ни пари станат 0 или по-малко

//        int myMoney = 500;
//        String clothes = scanner.nextLine();
//
//        while (!clothes.equals("Stop")) {
//            int price = Integer.parseInt(scanner.nextLine());
//
//            myMoney -= price;
//
//            if (myMoney <= 0) {
//                System.out.println("You are out of money!!!");
//                break;
//            } else {
//                System.out.printf("You buy a %s%n", clothes);
//            }
//
//            clothes = scanner.nextLine();
//        }

        String name = scanner.nextLine();

        while (!name.equals("Stop")) {

            if (name.equals("Kaloyan")) {
                name = scanner.nextLine();
                continue;
            }
            System.out.printf("%s get a yearly bonus: %n", name);

            name = scanner.nextLine();
        }





















    }
}
