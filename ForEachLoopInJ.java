import java.util.ArrayList;

public class ForEachLoopInJ {
    public static void main(String[] args) {
        // String[] animals = { "rat", "cat", "dog", "goat" };
        // for (String i : animals) {
        // System.out.println(i);
        // }

        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("goat");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
