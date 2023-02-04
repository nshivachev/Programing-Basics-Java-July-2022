package PB.forLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalActorPoints = academyPoints;

        for (int i = 1; i <= n; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            totalActorPoints += judgeName.length() * judgePoints / 2;
            if (totalActorPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalActorPoints);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalActorPoints);
    }
}
