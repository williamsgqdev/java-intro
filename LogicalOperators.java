import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // int temp = 25;

        // if (temp > 30) {
        // System.out.println("Its hot outside");
        // } else if (temp >= 20 && temp <= 30) {
        // System.out.println("Mild weather outside");
        // } else {
        // System.out.println("Its cold outside");
        // }

        /*
         * 
         * =============================================================================
         * 
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr q or Q to quit game ");

        String resp = scanner.next();

        if (resp.equals("q") || resp.equals("Q")) {
            System.out.println("You have successfully quit the game");
        } else {
            System.out.println("You have failed to quit the game");
        }

    }
}
