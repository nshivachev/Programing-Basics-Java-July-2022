package PB.Training;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int matchCount = Integer.parseInt(scanner.nextLine());
        int w = 0;
        int d = 0;
        int l = 0;

        for (int i = 1; i <= matchCount; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    w++;
                    break;
                case "D":
                    d++;
                    break;
                case "L":
                    l++;
                    break;
                default:
                    break;
            }
        }

        if (matchCount < 1) {
            System.out.println(teamName + " hasn't played any games during this season.");
        } else {
            System.out.printf("%s has won %d points during this season.%nTotal stats:%n", teamName, w * 3 + d);
            System.out.println("## W: " + w);
            System.out.println("## D: " + d);
            System.out.println("## L: " + l);
            System.out.printf("Win rate: %.2f%%", w * 1.0 / matchCount * 100);
        }
    }
}
