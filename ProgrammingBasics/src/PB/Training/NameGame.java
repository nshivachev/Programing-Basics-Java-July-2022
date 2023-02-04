package PB.Training;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        int points = 0;
        String winner = "";

        while (!playerName.equals("Stop")) {
            int currentPoints = 0;
            for (int i = 0; i < playerName.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());

                if (number == playerName.charAt(i)) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
            }

            if (points <= currentPoints) {
                points = currentPoints;
                winner = playerName;
            }

            playerName = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winner, points);
    }
}
