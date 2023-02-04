package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpus = Integer.parseInt(scanner.nextLine());
        int cpus = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double gpusPrice = gpus * 250;
        double cpusPrice = cpus * gpusPrice * 0.35;
        double ramPrice = ram * gpusPrice * 0.10;
        double totalPrice = gpusPrice + cpusPrice + ramPrice;

        if (gpus > cpus)
            totalPrice = totalPrice - totalPrice * 0.15;

        if (budget >= totalPrice)
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        else
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);

    }
}
