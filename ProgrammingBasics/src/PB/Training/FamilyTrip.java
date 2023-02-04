package PB.Training;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int additionalCost = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            nightPrice = nightPrice - nightPrice * 5 / 100;
        }

        double sum = nights * nightPrice + budget * additionalCost / 100;

        double diff = Math.abs(budget - sum);

        if (sum <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}
