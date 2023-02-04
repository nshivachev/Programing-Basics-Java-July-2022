package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seriesTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;
        double remainingTime = breakTime - lunchTime - restTime;
        double difference = Math.abs(remainingTime - seriesTime);

        if (remainingTime >= seriesTime)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(difference));
        else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(difference));
    }
}
