package PB.Exam2;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String age = scanner.nextLine();
        int kidsNumber = 0;
        int adultsNumber = 0;
        int toysMoney = 0;
        int sweatersMoney = 0;

        while (!age.equals("Christmas")) {
            int currentAge = Integer.parseInt(age);
            if (currentAge <= 16) {
                kidsNumber++;
                toysMoney += 5;
            } else {
                adultsNumber++;
                sweatersMoney += 15;
            }
            age = scanner.nextLine();
        }
        System.out.println("Number of adults: " + adultsNumber);
        System.out.println("Number of kids: " + kidsNumber);
        System.out.println("Money for toys: " + toysMoney);
        System.out.println("Money for sweaters: " + sweatersMoney);
    }
}
