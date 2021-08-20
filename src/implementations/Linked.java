package implementations;

import java.util.LinkedList;

public interface Linked<E>{
    void addLast(E e);
    void addFirst(E e);
    void addInside(E e);
    //void linkBefore(E e, Node<E> succ);
    int size();
    E getElementByIndex(int counter);

}
