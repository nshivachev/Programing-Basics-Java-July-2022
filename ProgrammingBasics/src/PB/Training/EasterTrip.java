package PB.Training;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String place = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (place) {
            case "France":
                switch (dates) {
                    case "21-23":
                        price = 30;
                        break;
                    case "24-27":
                        price = 35;
                        break;
                    case "28-31":
                        price = 40;
                        break;
                    default:
                        break;
                }
                break;
            case "Italy":
                switch (dates) {
                case "21-23":
                    price = 28;
                    break;
                case "24-27":
                    price = 32;
                    break;
                case "28-31":
                    price = 39;
                    break;
                default:
                    break;
            }
            break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        price = 32;
                        break;
                    case "24-27":
                        price = 37;
                        break;
                    case "28-31":
                        price = 43;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        System.out.printf("Easter trip to %s : %.2f leva.", place, nights * price);
    }
}
