package PB.Exam2;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());

        int totalDistance = 384400 * 2;
        double time = Math.ceil(totalDistance / averageSpeed);
        double totalTime = time + 3;
        double totalFuel = fuel * totalDistance / 100;

        System.out.printf("%.0f%n", totalTime);
        System.out.printf("%.0f", totalFuel);
    }
}
