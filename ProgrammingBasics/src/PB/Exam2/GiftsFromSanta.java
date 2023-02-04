package PB.Exam2;

import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int missedNum = Integer.parseInt(scanner.nextLine());

        for (int i = endNum; i >= startNum; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == missedNum) {
                    break;
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
