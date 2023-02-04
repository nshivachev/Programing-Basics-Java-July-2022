package PB.Training;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double hearthstone = 0;
        double fornite = 0;
        double overwatch = 0;
        double others = 0;

        int gamesCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= gamesCount; i++) {
            String gameName = scanner.nextLine();

            switch (gameName) {
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", hearthstone / gamesCount * 100);
        System.out.printf("Fornite - %.2f%%%n", fornite / gamesCount * 100);
        System.out.printf("Overwatch - %.2f%%%n", overwatch / gamesCount * 100);
        System.out.printf("Others - %.2f%%%n", others / gamesCount * 100);
    }
}
