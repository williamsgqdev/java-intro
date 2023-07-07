public class Arrays {
    public static void main(String[] args) {
        // String[] cars = { "Camaro", "Telsa", "Moto" };
        // cars[0] = " Muslim";

        String[] cars = new String[3];

        cars[0] = "Chevrolet";
        cars[1] = "Mustang";
        cars[2] = "Oktober";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
