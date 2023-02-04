package PB.Training;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String period = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double monthPrice = 0;
        double totalPrice = 0;

        if (period.equals("one")) {
            if (type.equals("Small")) {
                monthPrice = 9.98;
            } else if (type.equals("Middle")) {
                monthPrice = 18.99;
            } else if (type.equals("Large")) {
                monthPrice = 25.98;
            } else if (type.equals("ExtraLarge")) {
                monthPrice = 35.99;
            }
        } else {
            if (type.equals("Small")) {
                monthPrice = 8.58;
            } else if (type.equals("Middle")) {
                monthPrice = 17.09;
            } else if (type.equals("Large")) {
                monthPrice = 23.59;
            } else if (type.equals("ExtraLarge")) {
                monthPrice = 31.79;
            }
        }

        if (internet.equals("yes")) {
            if (monthPrice <= 10) {
                monthPrice = monthPrice + 5.50;
            } else if (monthPrice <= 30) {
                monthPrice = monthPrice + 4.35;
            } else {
                monthPrice = monthPrice + 3.85;
            }
        }

        totalPrice = monthPrice * months;

        if (period.equals("two")) {
            totalPrice = totalPrice - totalPrice * 3.75 / 100;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
