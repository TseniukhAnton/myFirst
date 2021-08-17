package implementations;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addFirst("assdf");
        stringLinked.addLast("aswe");


        Iterator iterator = stringLinked.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(stringLinked.size());
    }
}
