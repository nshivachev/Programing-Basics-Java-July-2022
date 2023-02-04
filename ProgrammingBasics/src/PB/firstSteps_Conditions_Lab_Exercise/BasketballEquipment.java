package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double snickers = tax - tax * 0.4;
        double outfit = snickers - snickers * 0.2;
        double ball = outfit * 1/4;
        double accessories = ball * 1/5;
        double costs = tax + snickers + outfit + ball + accessories;
        System.out.println(costs);

    }
}
