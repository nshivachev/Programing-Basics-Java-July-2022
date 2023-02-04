package PB.Training;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bread = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookie = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", bread * 3.20 + eggs * 4.35 + cookie * 5.40 + eggs * 12 * 0.15);
    }
}
