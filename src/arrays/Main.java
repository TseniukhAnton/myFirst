package arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0;i <= 10; i++){
            num.add(i);
        }
        System.out.println(num);

        ListIterator iterator = num.listIterator();
        while(iterator.hasNext()){
            num.set(iterator.nextIndex(), iterator.nextIndex()+1);
            System.out.println(iterator.next());
        }





    }
}
