package PB.Training;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double taxPerHour = 0;
        double totalSum = 0;

        for (int d = 1; d <= days; d++) {
            double daySum = 0;
            for (int h = 1; h <= hours; h++) {
                if (d % 2 == 0 && h % 2 != 0) {
                    taxPerHour = 2.50;                    
                } else if (d % 2 != 0 && h % 2 == 0) {
                    taxPerHour = 1.25;
                } else {
                    taxPerHour = 1;
                }
                daySum = daySum + taxPerHour;
            }
            System.out.printf("Day: %d - %.2f leva%n", d, daySum);
            totalSum = totalSum + daySum;
        }

        System.out.printf("Total: %.2f leva", totalSum);
    }
}
