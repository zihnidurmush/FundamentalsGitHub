package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKgSkumria = Double.parseDouble(scanner.nextLine()); //цена на скумрията на килограм
        double pricePerKgCaca = Double.parseDouble(scanner.nextLine()); //цена на цацата на килограм
        double kgPalamud = Double.parseDouble(scanner.nextLine()); //килограма паламуд
        double kgSafrid = Double.parseDouble(scanner.nextLine()); //килограма сафрид
        int kgMidi = Integer.parseInt(scanner.nextLine()); //килограма миди

        double pricePalamud = pricePerKgSkumria * 1.6;
        double sumPalamud = pricePalamud * kgPalamud;
        double priceSafrid = pricePerKgCaca * 1.8;
        double sumSafrid = priceSafrid * kgSafrid;
        double sumMidi = kgMidi * 7.5;

        double totalsum = sumPalamud +sumSafrid + sumMidi;

        System.out.printf("%.2f", totalsum);

    }
}
