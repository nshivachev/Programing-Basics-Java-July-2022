package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine()) * extras;
        double decorPrice = budget * 0.1;

        if (extras > 150) {
            clothesPrice = clothesPrice - clothesPrice * 0.1;
        }

        double costs = clothesPrice + decorPrice;

        if (costs > budget)
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", costs - budget);
        else
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - costs);
    }
}
