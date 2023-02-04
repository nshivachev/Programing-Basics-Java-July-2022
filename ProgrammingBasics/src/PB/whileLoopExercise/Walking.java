package PB.whileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String steps;
        int totalSteps = 0;

        while (totalSteps <= 10000) {
            steps = scanner.nextLine();
            if (steps.equals("Going home")) {
                steps = scanner.nextLine();
                totalSteps += Integer.parseInt(steps);
                break;
            } else {
                totalSteps += Integer.parseInt(steps);
            }
        }

        int difference = Math.abs(10000 - totalSteps);

        if (totalSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", difference);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", difference);
        }
    }
}
