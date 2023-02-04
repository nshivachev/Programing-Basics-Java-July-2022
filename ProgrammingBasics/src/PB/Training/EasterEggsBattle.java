package PB.Training;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstPlayerEggs = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggs = Integer.parseInt(scanner.nextLine());

        boolean firstPlayerNoEggs = false;
        boolean secondPlayerNoEggs = false;

        String winner = scanner.nextLine();

        while (!winner.equals("End")) {
            if (winner.equals("one")) {
                secondPlayerEggs--;
            } else {
                firstPlayerEggs--;
            }

            if (firstPlayerEggs == 0) {
                firstPlayerNoEggs = true;
                break;
            } else if (secondPlayerEggs == 0) {
                secondPlayerNoEggs = true;
                break;
            }
            winner = scanner.nextLine();
        }

        if (firstPlayerNoEggs) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggs);
        } else if (secondPlayerNoEggs) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEggs);
        } else {
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEggs);
            System.out.printf("Player two has %d eggs left.", secondPlayerEggs);
        }
    }
}
