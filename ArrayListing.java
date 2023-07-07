import java.util.ArrayList;

public class ArrayListing {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("HandBurger");
        food.add("Hot Dog");

        food.set(0, "Akpu");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
