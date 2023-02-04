package PB.Training;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int voucherValue = Integer.parseInt(scanner.nextLine());
        String purchase = scanner.nextLine();
        int price;
        int tickets = 0;
        int others = 0;


        while (!purchase.equals("End")) {

            if (purchase.length() > 8) {
                price = purchase.charAt(0) + purchase.charAt(1);
                if (voucherValue < price) {
                    break;
                }
                tickets++;
            } else {
                price = purchase.charAt(0);
                if (voucherValue < price) {
                    break;
                }
                others++;
            }

            voucherValue = voucherValue - price;

            purchase = scanner.nextLine();
        }

        System.out.println(tickets);
        System.out.println(others);
    }
}
