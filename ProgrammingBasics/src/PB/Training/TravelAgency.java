package PB.Training;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String type = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (days >= 1) {
            if (days > 7) {
                days--;
            }
            if (city.equals("Bansko") || city.equals("Borovets")) {
                if (type.equals("withEquipment")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price - price * 10 / 100;
                    }
                    System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                } else if (type.equals("noEquipment")) {
                    price = 80;
                    if (vip.equals("yes")) {
                        price = price - price * 5 / 100;
                    }
                    System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                } else {
                    System.out.println("Invalid input!");
                }
            } else if (city.equals("Varna") || city.equals("Burgas")) {
                if (type.equals("withBreakfast")) {
                    price = 130;
                    if (vip.equals("yes")) {
                        price = price - price * 12 / 100;
                    }
                    System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                } else if (type.equals("noBreakfast")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price - price * 7 / 100;
                    }
                    System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
        } else {
            System.out.println("Days must be positive number!");
        }
    }
}
