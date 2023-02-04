package PB.Training;

import java.util.Scanner;

public class SubmitSolution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int originalCount = Integer.parseInt(scanner.nextLine());

        int totalCount = originalCount;
        int soldEggs = 0;
        boolean notEnoughEggs = false;

        String command = scanner.nextLine();

        while (!command.equals("Close")) {
            int eggsCount = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (eggsCount > totalCount) {
                    notEnoughEggs = true;
                    break;
                }
                soldEggs += eggsCount;
                totalCount -= eggsCount;
            } else {
                totalCount += eggsCount;
            }

            command = scanner.nextLine();
        }

        if (notEnoughEggs) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", totalCount);
        } else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}
