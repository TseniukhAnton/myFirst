package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"Elefant");
        list.add(1,"Horse");
        list.add(2,"Lion");
        list.add(3,"Puma");
        list.add(4,"Tiger");
        list.add(5,"Possum");
        list.add(6,"Hippo");
        list.add(7,"Chicken");

        list.add(8,"Lion");
        list.add(0,"Snake");
        //list.remove(0);

        list.stream().spliterator();

        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.size());
        System.out.println(list.get(5).hashCode());
        System.out.println(list.get(0).hashCode());


    }

}
