package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;
        double capacityCM =  length * width * height;
        double capacityL = capacityCM * 0.001;
        double requiredLiters = capacityL * (1 - percent);
        System.out.println(requiredLiters);
    }
}
