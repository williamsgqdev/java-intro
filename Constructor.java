public class Constructor {
    public static void main(String[] args) {
        Human human = new Human("John", 19, 50);

        Human person = new Human("Doe", 21, 50);

        System.out.println(person.age);
        person.drink();
    }
}
