package PB.Training;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int student = 0;
        int standard = 0;
        int kid = 0;

        String titleMove = scanner.nextLine();


        while (!titleMove.equals("Finish")) {
            int freeSits = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int tickets = 0;
            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                    default:
                        break;
                }
                tickets++;

                if (tickets >= freeSits) {
                    break;
                }

                ticketType = scanner.nextLine();
            }
            totalTickets += tickets;
            System.out.printf("%s - %.2f%% full.%n", titleMove, tickets * 1.0 / freeSits * 100);
            titleMove = scanner.nextLine();
        }

        System.out.println("Total tickets: " + totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kid * 1.0 / totalTickets * 100);
    }
}
