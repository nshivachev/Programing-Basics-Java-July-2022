package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double additionalCosts = paint * 0.1 * 14.50 + 2 * 1.50 + 0.40;
        double sum = nylon * 1.50 + paint * 14.50 + thinner * 5.0 + additionalCosts;
        double fullPrice = sum * 0.3 * hours + sum;
        System.out.println(fullPrice);
    }
}
