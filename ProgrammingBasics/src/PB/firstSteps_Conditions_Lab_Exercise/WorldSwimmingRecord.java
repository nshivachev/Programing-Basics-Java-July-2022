package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double time = meters * secondsPerMeter;
        double timesToSlowDown = Math.floor(meters / 15);
        double slowDown = timesToSlowDown * 12.5;
        double totalTime = time + slowDown;

        if (record > totalTime)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        else
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
    }
}
