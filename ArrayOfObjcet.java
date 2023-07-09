public class ArrayOfObjcet {
    public static void main(String[] args) {
        // Food[] firdge = new Food[3];

        Food food1 = new Food("Yam");
        Food food2 = new Food("Egg");
        Food food3 = new Food("Beans");

        Food[] firdge = { food1, food2, food3 };

        for (Food food : firdge) {
            System.out.println(food.name);
        }

        // firdge[0] = food1;
        // firdge[1] = food2;
        // firdge[2] = food3;
    }
}
