package PB.Training;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangeQuantity = Double.parseDouble(scanner.nextLine());
        double raspberryQuantity = Double.parseDouble(scanner.nextLine());
        double strawberryQuantity = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice / 2;
        double orangePrice = raspberryPrice - raspberryPrice * 40 / 100;
        double bananasPrice = raspberryPrice - raspberryPrice * 80 / 100;

        double sum = strawberryPrice * strawberryQuantity + raspberryPrice * raspberryQuantity + orangePrice * orangeQuantity + bananasPrice * bananasQuantity;

        System.out.printf("%.2f", sum);

    }
}
