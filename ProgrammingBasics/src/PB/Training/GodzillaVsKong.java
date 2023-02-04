package PB.Training;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothSinglePrice = Double.parseDouble(scanner.nextLine());
        double decorPrice = budget * 10 / 100;

        double clothTotalPrice = extras * clothSinglePrice;

        if (extras > 150) {
            clothTotalPrice = clothTotalPrice - clothTotalPrice * 10 / 100;
        }

        double diff = budget - (decorPrice + clothTotalPrice);

        if (decorPrice + clothTotalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(diff));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(diff));
        }
    }
}
