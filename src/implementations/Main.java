package implementations;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        LinkedContainer<String> stringLinked = new LinkedContainer<>();

//        stringLinked.addFirst("first");
//        stringLinked.addFirst("second");
//        stringLinked.addFirst("asswww");
//        stringLinked.addLast("aswe");
//        stringLinked.addLast("asasssddd");
//        stringLinked.addLast("astt");
//        stringLinked.addLast("last");
        stringLinked.addMiddle("middleF");
        stringLinked.addMiddle("middleL");
        stringLinked.addMiddle("middleMiddle");
//        stringLinked.addMiddle("middleMiddle1");
//        stringLinked.addMiddle("middleMiddle2");


        Iterator iterator = stringLinked.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(stringLinked.size());
    }
}
