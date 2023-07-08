public class MethodsInJ {
    public static void main(String[] args) {
        hello("Williams");
    }

    static void hello(String name) {
        System.out.println("Hello " + name);
        int result = add(4, 5);

        System.out.println(result);
    }

    static int add(int x, int y) {

        return x + y;
    }
}
