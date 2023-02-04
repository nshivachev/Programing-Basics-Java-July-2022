package PB.nestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean flag = false;

        for (int x = startNumber; x <= endNumber; x++) {
            for (int y = startNumber; y <= endNumber; y++) {
                counter++;
                if (x + y == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, x, y, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        if (!flag)
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
    }
}
