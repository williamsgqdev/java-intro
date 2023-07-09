public class Car {
    String make = "Mustang";
    String model = "Nascar";
    int year = 2023;
    String color = "Yellow";
    double price = 50000.0;

    void drive() {
        System.out.println("You are driving a car");
    }

    void brake() {
        System.out.println("You step on the break");
    }

    public String toString() {
        return make + "\n" + model + "\n" + year + "\n" + color + "\n" + price;
    }
}
