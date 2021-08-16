package Implementations;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addFirst("assdf");
        stringLinked.addFirst("aswe");
        stringLinked.addFirst("rr");
        stringLinked.addFirst("qqq");


        Iterator iterator = stringLinked.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
