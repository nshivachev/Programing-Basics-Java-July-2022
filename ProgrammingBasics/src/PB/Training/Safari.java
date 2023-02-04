package PB.Training;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String weekDay = scanner.nextLine();

        double totalPrice = fuel * 2.10 + 100;

        if (weekDay.equals("Saturday")) {
            totalPrice = totalPrice - totalPrice * 10 / 100;
        } else {
            totalPrice = totalPrice - totalPrice * 20 / 100;
        }

        double diff = Math.abs(totalPrice - budget);

        if (budget >= totalPrice) {
            System.out.printf("Safari time! Money left: %.2f lv. ", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }
    }
}
