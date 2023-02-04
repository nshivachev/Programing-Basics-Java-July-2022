package PB.Training;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kgFlourPrice = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        int eggsCarton = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double kgSugarPrice = kgFlourPrice - kgFlourPrice * 25 / 100;
        double eggsCartonPrice = kgFlourPrice + kgFlourPrice * 10 / 100;
        double yeastPrice = kgSugarPrice - kgSugarPrice * 80 / 100;

        double totalSum = kgFlour * kgFlourPrice + kgSugar * kgSugarPrice + eggsCarton * eggsCartonPrice + yeast * yeastPrice;

        System.out.printf("%.2f", totalSum);
    }
}
