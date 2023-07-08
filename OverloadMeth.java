public class OverloadMeth {
    public static void main(String[] args) {
        int x = add(2, 3);

        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("Overload method number 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overload method number 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overload method number 3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("Overload method number 4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("Overload method number 5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("Overload method number 6");
        return a + b + c + d;
    }

}
