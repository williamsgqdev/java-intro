public class IfStatement {
    public static void main(String[] args) {
        int age = 1;

        if (age >= 75) {
            System.out.println("You are a boomer");
        } else if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
