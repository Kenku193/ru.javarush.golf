package Module2.Lesson18.Example4Lombok;

public class Test {
    public static void main(String[] args) {

        Human human = new Human("Yura", 35);
        Human human1 = new Human("Yura", 89);

        System.out.println(human.equals(human1));

        System.out.println();



    }
}
