package PB.Exam2;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int locationCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locationCount; i++) {
            double expectedAverageCount = Integer.parseInt(scanner.nextLine());
            int daysPerLocation = Integer.parseInt(scanner.nextLine());
            double goldPerLocation = 0;
            for (int j = 1; j <= daysPerLocation; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                goldPerLocation = goldPerLocation + goldPerDay;
            }
            double averageGoldPerLocation = goldPerLocation / daysPerLocation;
            if (averageGoldPerLocation >= expectedAverageCount) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerLocation);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedAverageCount - averageGoldPerLocation);
            }
        }
    }
}
