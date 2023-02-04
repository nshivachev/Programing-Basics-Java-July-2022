package PB.Training;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hallFee = Integer.parseInt(scanner.nextLine());

        double statuette = hallFee - hallFee * 1.0 * 30 / 100;
        double kettering = statuette - statuette * 15 / 100;
        double voicing = kettering - kettering * 1 / 2;

        System.out.printf("%.2f", hallFee + statuette + kettering + voicing );
    }
}
