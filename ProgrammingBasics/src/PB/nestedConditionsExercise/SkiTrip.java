package PB.nestedConditionsExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String accommodation = scanner.nextLine();
        String feedback = scanner.nextLine();
        double singleRoomTotalPrice = 18 * nights;
        double apartmentTotalPrice = 25 * nights;
        double presidentApartmentTotalPrice = 35 * nights;

        if (days < 10) {
            if (accommodation.equals("apartment")) {
                apartmentTotalPrice = apartmentTotalPrice - apartmentTotalPrice * 0.3;
            } else if (accommodation.equals("president apartment")) {
                presidentApartmentTotalPrice = presidentApartmentTotalPrice - presidentApartmentTotalPrice * 0.1;
            }
        } else if (days <= 15) {
            if (accommodation.equals("apartment")) {
                apartmentTotalPrice = apartmentTotalPrice - apartmentTotalPrice * 0.35;
            } else if (accommodation.equals("president apartment")) {
                presidentApartmentTotalPrice = presidentApartmentTotalPrice - presidentApartmentTotalPrice * 0.15;
            }
        } else {
            if (accommodation.equals("apartment")) {
                apartmentTotalPrice = apartmentTotalPrice - apartmentTotalPrice * 0.5;
            } else if (accommodation.equals("president apartment")) {
                presidentApartmentTotalPrice = presidentApartmentTotalPrice - presidentApartmentTotalPrice * 0.2;
            }
        }

        if (feedback.equals("positive")) {
            singleRoomTotalPrice = singleRoomTotalPrice + singleRoomTotalPrice * 0.25;
            apartmentTotalPrice = apartmentTotalPrice + apartmentTotalPrice * 0.25;
            presidentApartmentTotalPrice = presidentApartmentTotalPrice + presidentApartmentTotalPrice * 0.25;
        } else {
            singleRoomTotalPrice = singleRoomTotalPrice - singleRoomTotalPrice * 0.1;
            apartmentTotalPrice = apartmentTotalPrice - apartmentTotalPrice * 0.1;
            presidentApartmentTotalPrice = presidentApartmentTotalPrice - presidentApartmentTotalPrice * 0.1;
        }

        if (accommodation.equals("room for one person"))
            System.out.printf("%.2f", singleRoomTotalPrice);
        else if (accommodation.equals("apartment"))
            System.out.printf("%.2f", apartmentTotalPrice);
        else
            System.out.printf("%.2f", presidentApartmentTotalPrice);
    }
}
