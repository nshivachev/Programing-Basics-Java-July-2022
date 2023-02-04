package PB.Training;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBreadCount = Math.ceil(guestsCount / 3.0);
        int eggsCount = guestsCount * 2;

        double easterBreadPrice = easterBreadCount * 4;
        double eggsPrice = eggsCount * 0.45;

        double totalPrice = easterBreadPrice + eggsPrice;
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", easterBreadCount, eggsCount);
            System.out.printf("He has %.2f lv. left.", diff);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%nHe needs %.2f lv. more.", diff);
        }
    }
}
