package Practice;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int racketPieces = Integer.parseInt(scanner.nextLine());
        int tennisShoes = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        double tennisShoesPrice = tennisRacketPrice / 6;

        double rackets = tennisRacketPrice * racketPieces;
        double shoes = tennisShoes * tennisShoesPrice;
        double totalExpenditures = rackets + shoes;

        double otherEquipment = 0.20 * totalExpenditures;

        totalSum = totalExpenditures + otherEquipment;

        double priceForDjokovic = totalSum * 1 / 8;
        double priceForSponsors = totalSum * 7 / 8;


        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(priceForDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(priceForSponsors));


    }
}
