package PB.Training;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int units = startNum; units <= endNum ; units++) {
            for (int  tens = startNum; tens <= endNum; tens++) {
                for (int hundreds = startNum; hundreds <= endNum; hundreds++) {
                    for (int thousands = startNum; thousands <= endNum; thousands++) {
                        if (((units % 2 == 0 && thousands % 2 != 0) || (units % 2 != 0 && thousands % 2 == 0)) && (units > thousands) && ((tens + hundreds) % 2 == 0)) {
                            System.out.printf("%d%d%d%d ", units, tens, hundreds, thousands);
                        }
                    }
                }
            }
        }
    }
}
