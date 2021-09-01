package simpleArrayListDemo;

public class SimpleArrayDemo {
    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.update(1, "update");
        System.out.println(strings.get(1));
        System.out.println(strings.size());

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
