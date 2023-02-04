package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double money = puzzles * 2.60 + dolls * 3 + teddyBear * 4.10 + minions * 8.20 + trucks * 2;

        if (puzzles + dolls + teddyBear + minions + trucks >= 50 ) {
            money = money - money * 0.25;
        }
        money = money - money * 0.1;

        if (money >= vacationPrice)
            System.out.printf("Yes! %.2f lv left.", money - vacationPrice);
        else
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - money);
    }
}
