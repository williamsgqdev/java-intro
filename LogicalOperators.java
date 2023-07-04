public class LogicalOperators {
    public static void main(String[] args) {
        int temp = 25;

        if (temp > 30) {
            System.out.println("Its hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("Mild weather outside");
        } else {
            System.out.println("Its cold outside");
        }

    }
}
