package PB.Training;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entranceTax = Double.parseDouble(scanner.nextLine());
        double loungePrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = (people * entranceTax) + Math.ceil(people * 1.0 / 2) * umbrellaPrice + Math.ceil(people * 0.75) * loungePrice;

        System.out.printf("%.2f lv.", totalPrice);


    }
}
