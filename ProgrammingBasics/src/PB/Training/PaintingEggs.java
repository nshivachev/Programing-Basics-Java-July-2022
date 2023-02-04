package PB.Training;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (size) {
            case "Large":
                switch (color) {
                    case "Red":
                        price = 16;
                        break;
                    case "Green":
                        price = 12;
                        break;
                    case "Yellow":
                        price = 9;
                        break;
                    default:
                        break;
                }
                break;
            case "Medium":
                switch (color) {
                    case "Red":
                        price = 13;
                        break;
                    case "Green":
                        price = 9;
                        break;
                    case "Yellow":
                        price = 7;
                        break;
                    default:
                        break;
                }
                break;
            case "Small":
                switch (color) {
                    case "Red":
                        price = 9;
                        break;
                    case "Green":
                        price = 8;
                        break;
                    case "Yellow":
                        price = 5;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        double totalPrice = count * price;
        totalPrice = totalPrice - totalPrice * 35 / 100;

        System.out.printf("%.2f leva.", totalPrice);
    }
}
