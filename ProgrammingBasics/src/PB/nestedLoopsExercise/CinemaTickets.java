package PB.nestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int standard = 0;
        int kid = 0;
        int student = 0;

        String movie = scanner.nextLine();

        while (!movie.equals("Finish")) {
            int freeSits = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int tickets = 0;
            while (!ticketType.equals("End")) {
                tickets++;
                switch (ticketType) {
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                    case "student":
                        student++;
                        break;
                    default:
                        break;
                }

                if (tickets >= freeSits) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            totalTickets += tickets;
            System.out.printf("%s - %.2f%% full.%n", movie, tickets * 1.0 / freeSits * 100);
            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalTickets *100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets *100);
        System.out.printf("%.2f%% kids tickets.%n", kid * 1.0 / totalTickets *100);
    }
}
