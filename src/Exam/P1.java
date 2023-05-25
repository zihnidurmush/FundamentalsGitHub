package Exam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxes = Integer.parseInt(scanner.nextLine()); //Броя кутии с боя – цяло число
        int wallpapers = Integer.parseInt(scanner.nextLine()); //Броя на ролките тапети – цяло число
        double gloves = Double.parseDouble(scanner.nextLine()); //Цената за един чифт ръкавици – реално число
        double paintBrush1Piece = Double.parseDouble(scanner.nextLine()); //Цената за една четка – реално число

        double boxPrice = 21.50;
        double wallpaperPrice = 5.20;
        double neededGloves = Math.ceil(wallpapers * 0.35);
        double neededBrushes = Math.floor(boxes * 0.48);

        double sumPaint = boxPrice * boxes;
        double sumWallpapers = wallpaperPrice * wallpapers;
        double sumGloves = neededGloves * gloves;
        double sumBrushes = neededBrushes * paintBrush1Piece;

        double totalSum = sumPaint + sumWallpapers + sumGloves + sumBrushes;

        double deliveryCost = totalSum / 15;

        System.out.printf("This delivery will cost %.2f lv.", deliveryCost);


    }
}
