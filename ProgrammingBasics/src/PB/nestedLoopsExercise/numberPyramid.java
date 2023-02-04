package PB.nestedLoopsExercise;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 0;
        boolean flag = false;

        for (int rows = 1 ; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                current++;
                System.out.print(current + " ");

                if (current == n) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
