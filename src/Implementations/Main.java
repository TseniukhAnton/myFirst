package Implementations;

public class Main {
    public static void main(String[] args) {
        Linked<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("lastElement");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(1));
    }
}
