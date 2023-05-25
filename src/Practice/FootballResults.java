package Practice;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Резултат от първия мач – текст
        String result1 = scanner.nextLine();
        //2.	Резултат от втория мач – текст
        String result2 = scanner.nextLine();
        //3.	Резултат от третия мач – текст
        String result3 = scanner.nextLine();
        int winCount = 0;
        int drawCount = 0;
        int loseCount = 0;

        if (result1.charAt(0) > result1.charAt(2)) {
            winCount++;
        } else if (result1.charAt(0) == result1.charAt(2)) {
            drawCount++;
        } else if (result1.charAt(0) < result1.charAt(2)) {
            loseCount++;
        }

        if (result2.charAt(0) > result2.charAt(2)) {
            winCount++;
        } else if (result2.charAt(0) == result2.charAt(2)) {
            drawCount++;
        } else if (result2.charAt(0) < result2.charAt(2)) {
            loseCount++;
        }

        if (result3.charAt(0) > result3.charAt(2)) {
            winCount++;
        } else if (result3.charAt(0) == result3.charAt(2)) {
            drawCount++;
        } else if (result3.charAt(0) < result3.charAt(2)) {
            loseCount++;
        }
//•	"Team won {брой спечелени мачове} games."
        System.out.printf("Team won %d games.%n", winCount);
//•	"Team lost {брой загубени мачове} games."
        System.out.printf("Team lost %d games.%n", loseCount);
//•	" Drawn games: {брой равни мачове}"
        System.out.printf("Drawn games: %d", drawCount);

    }
}
