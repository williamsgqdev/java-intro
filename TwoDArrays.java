public class TwoDArrays {
    public static void main(String[] args) {
        String[][] cars = {
                { "Camaro", "Covet", "Mustard" },
                { "Camino", " convertible", "Mitch" },
                { "Tesla", "Luigi", "Bengali" },
        };

        for (int i = 0; i < cars.length; i++) {
            System.err.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
