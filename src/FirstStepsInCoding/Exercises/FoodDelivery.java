package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine()); //Брой пилешки менюта
        int fishMenu = Integer.parseInt(scanner.nextLine()); //Брой менюта с риба
        int vegMenu = Integer.parseInt(scanner.nextLine()); //Брой вегетариански менюта

        double priceForChicken = chickenMenu * 10.35;
        double priceForFish = fishMenu * 12.40;
        double priceForVeg = vegMenu * 8.15;
        double priceAllMenus = priceForChicken + priceForFish + priceForVeg;
        double priceDessert = priceAllMenus * 20 / 100;

        double totalPrice = priceAllMenus + priceDessert + 2.50;

        System.out.println(totalPrice);

        // Да се отпечата на конзолата един ред:  "{цена на поръчката}"



    }

}
