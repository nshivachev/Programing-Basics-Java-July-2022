package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine())/100;
        double sum = deposit + months * ((deposit * percent) / 12);
        System.out.println(sum);
    }
}
