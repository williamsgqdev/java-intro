import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        do {
            System.out.print("Please enter a name : ");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("Your name is " + name);
    }
}