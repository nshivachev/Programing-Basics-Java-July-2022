package PB.Training;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String hallType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double profit = 0;

        if (movie.equals("A Star Is Born")) {
            if (hallType.equals("normal")) {
                profit = 7.50;
            } else if (hallType.equals("luxury")) {
                profit = 10.50;
            } else if (hallType.equals("ultra luxury")) {
                profit = 13.50;
            }
        } else if (movie.equals("Bohemian Rhapsody")) {
            if (hallType.equals("normal")) {
                profit = 7.35;
            } else if (hallType.equals("luxury")) {
                profit = 9.45;
            } else if (hallType.equals("ultra luxury")) {
                profit = 12.75;
            }
        } else if (movie.equals("Green Book")) {
            if (hallType.equals("normal")) {
                profit = 8.15;
            } else if (hallType.equals("luxury")) {
                profit = 10.25;
            } else if (hallType.equals("ultra luxury")) {
                profit = 13.25;
            }
        } else if (movie.equals("The Favourite")) {
            if (hallType.equals("normal")) {
                profit = 8.75;
            } else if (hallType.equals("luxury")) {
                profit = 11.55;
            } else if (hallType.equals("ultra luxury")) {
                profit = 13.95;
            }
        }

        profit = profit * tickets;
        System.out.printf("%s -> %.2f lv.", movie, profit);
    }
}
