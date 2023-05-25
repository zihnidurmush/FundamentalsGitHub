package Practice;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int startingHeight = target - 30;
        boolean isFailed = false;
        int jumps = 0;

        while (target >= startingHeight) {

            for (int i = 1; i <= 3; i++) {
                jumps++;
                int currentHeight = Integer.parseInt(scanner.nextLine());
                if (currentHeight > startingHeight) {
                    startingHeight = startingHeight + 5;
                    break;
                }
                if (i == 3) {
                    isFailed = true;
                    break;
                }
            }
            if (isFailed) {
                break;
            }
        }
        if (isFailed) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", startingHeight, jumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", target, jumps);
        }
    }
}

//
//    int jumpCounter = 0;
//    int counterUnsuccessful = 0;
//    boolean isGreater = false;

//   isGreater=true;
//            if (attempt > startingHeight) {
//                jumpCounter++;
//                startingHeight = startingHeight + 5;
//            } else {
//                counterUnsuccessful++;
//            }
//            if (counterUnsuccessful == 3) {
//                break;
//            }
//
//            attempt = Integer.parseInt(scanner.nextLine());
//        }
//if (isGreater) {
//    System.out.printf("Tihomir succeeded, he jumped over %d cm after %d jumps.", currentHeight, jumpCounter);
//} else {
//    System.out.printf("Tihomir failed at %dcm after {брой скокове от началото на тренировката} jumps.");
//}