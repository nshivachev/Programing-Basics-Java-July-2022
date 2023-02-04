package PB.Exam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int seaCount = Integer.parseInt(scanner.nextLine());
        int mountainCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        int profit = 0;
        boolean isAllSold = false;

        while (!type.equals("Stop")) {
            if (seaCount == 0 && mountainCount == 0) {
                isAllSold = true;
                break;
            }

            if (type.equals("sea")) {
                if (seaCount != 0) {
                    profit = profit + 680;
                    seaCount--;
                }
            } else {
                if (mountainCount != 0) {
                    profit = profit + 499;
                    mountainCount--;
                }
            }
            type = scanner.nextLine();
        }

        if (isAllSold) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", profit);
    }
}
