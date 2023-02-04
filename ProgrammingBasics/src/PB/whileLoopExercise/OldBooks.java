package PB.whileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String input = scanner.nextLine();
        int bookNumber = 0;

        while (!input.equals(bookName)) {

            if (input.equals("No More Books")) {
                break;
            }

            input = scanner.nextLine();
            bookNumber++;
        }

        if (input.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookNumber);
        } else {
            System.out.printf("You checked %d books and found it.", bookNumber);
        }
    }
}
