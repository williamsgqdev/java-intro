import java.util.*;

public class TwoDArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("Pasta");
        bakeryList.add("Bacon");
        bakeryList.add("Garlic Bread");

        ArrayList<String> produceList = new ArrayList();

        produceList.add("Tomato");
        produceList.add("Pepper");
        produceList.add("Onion");

        ArrayList<String> drinksList = new ArrayList();

        drinksList.add("Malt");
        drinksList.add("Nutri Milk");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

    }
}