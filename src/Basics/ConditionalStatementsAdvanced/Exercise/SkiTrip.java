package Basics.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine()); //дни за престой
        String roomType = scanner.nextLine(); //вид помещение - "room for one person", "apartment" или "president apartment"
        String grade = scanner.nextLine(); //оценка - "positive"  или "negative"

        double roomPrice = 0;
        double totalsum = 0;
        int nights = days - 1;

        switch (roomType) {
            case "room for one person":
                roomPrice = 18;
                totalsum = nights * roomPrice;
                if (grade.equals("positive")) {
                    totalsum = totalsum * 1.25;
                } else if (grade.equals("negative")) {
                    totalsum = totalsum * 0.9;
                }
                // System.out.printf("%.2f", totalsum);
                break;
            case "apartment":
                roomPrice = 25;
                totalsum = nights * roomPrice;
                if (days < 10) {
                    totalsum = totalsum * 0.7;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.9;
                    }

                } else if (days >= 10 && days < 15) {
                    totalsum = totalsum * 0.65;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.9;
                    }

                } else if (days > 15) {
                    totalsum = totalsum * 0.50;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.9;
                    }
                }
                break;
            case "president apartment":
                roomPrice = 35;
                totalsum = nights * roomPrice;
                if (days < 10) {
                    totalsum = totalsum * 0.9;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.9;
                    }

                } else if (days >= 10 && days < 15) {
                    totalsum = totalsum * 0.85;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.9;
                    }

                } else if (days > 15) {
                    totalsum = totalsum * 0.80;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.9;
                    }
                }
                break;
        }
        System.out.printf("%.2f", totalsum);
    }
}

       /* if (roomType.equals("room for one person")) {
            roomPrice = 18;
            totalsum = nights * roomPrice;
            if (grade.equals("positive")) {
            totalsum = totalsum * 1.25;
            } else if (grade.equals("negative")) {
                totalsum = totalsum * 0.9;
            }
            System.out.printf("%.2f", totalsum); */

   /* } else if(roomType.equals("apartment"))

    {
        roomPrice = 25;
        totalsum = nights * roomPrice;
        if (days < 10) {
            totalsum = totalsum * 0.7;
            if (grade.equals("positive")) ;
            {
                totalsum = totalsum * 1.25;
            } else

        } else if (days >= 10 && days < 15) {
            totalsum = totalsum * 0.65;
        } else if (days > 15) {
            totalsum = totalsum * 0.50;
        }

    } else if(roomType.equals("president apartment"))

    {
        roomPrice = 35;


    }

}
}
*/

    /*    switch (roomType) {
            case "room for one person":
                roomPrice = 18;

            case "apartment":
                roomPrice = 25;

                if (nights < 10) {
                    totalsum = (days - 1) * roomPrice;
                    totalsum = totalsum * 0.7;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.90;
                    }
                } else if (nights >= 10 && nights <= 15) {
                    totalsum = (days - 1) * roomPrice;
                    totalsum = totalsum * 0.65;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.90;
                    }
                } else if (nights > 15) {
                    totalsum = (days - 1) * roomPrice;
                    totalsum = totalsum * 0.50;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.90;
                    }
                }
            case "president apartment":
                roomPrice = 35;
                if (nights < 10) {
                    totalsum = (days - 1) * roomPrice;
                    totalsum = totalsum * 0.9;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.90;
                    }
                } else if (nights >= 10 && nights <= 15) {
                    totalsum = (days - 1) * roomPrice;
                    totalsum = totalsum * 0.85;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.90;
                    }
                } else if (nights > 15) {
                    totalsum = (days - 1) * roomPrice;
                    totalsum = totalsum * 0.80;
                    if (grade.equals("positive")) {
                        totalsum = totalsum * 1.25;
                    } else if (grade.equals("negative")) {
                        totalsum = totalsum * 0.90;
                    }

                }
        }
        System.out.printf("%.2f", totalsum);
    }
}
*/