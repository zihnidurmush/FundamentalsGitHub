package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        int byuro = (int) ((h * 100 - 100) / 70);
        int red = (int) (w * 100 / 120);

        int mesta = byuro * red;

        int available = mesta - 3;

        System.out.printf("%d", available);
    }
}
