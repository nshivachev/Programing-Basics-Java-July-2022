package PB.whileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int spendingMoneyDays = 0;
        int totalDays = 0;

        while (spendingMoneyDays < 5) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            totalDays++;

            if (action.equals("spend")) {
                spendingMoneyDays++;
                currentMoney -= sum;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
            } else {
                spendingMoneyDays = 0;
                currentMoney += sum;
                if (currentMoney >= neededMoney) {
                    break;
                }
            }
        }

        if (spendingMoneyDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
