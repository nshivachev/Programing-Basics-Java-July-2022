package PB.Training;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int breadCount = Integer.parseInt(scanner.nextLine());

        int totalSugar = 0;
        int totalFlour = 0;

        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= breadCount; i++) {
            int sugarCount = Integer.parseInt(scanner.nextLine());
            int flourCount = Integer.parseInt(scanner.nextLine());

            totalSugar += sugarCount;
            totalFlour += flourCount;

            if (sugarCount > maxSugar) {
                maxSugar = sugarCount;
            }

            if (flourCount > maxFlour) {
                maxFlour = flourCount;
            }
        }

        System.out.printf("Sugar: %.0f%n", Math.ceil(totalSugar / 950.0));
        System.out.printf("Flour: %.0f%n", Math.ceil(totalFlour / 750.0));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
