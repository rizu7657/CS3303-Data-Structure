package structure;

import java.util.EmptyStackException;

public class LinkedStack<E>{
    private Node<E> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    };

    public LinkedStack(E e) {
        top = new Node<>(e, top);
        size = 0;
    }

    public E push(E item) {
        top = new Node<>(item, top);
        size++;
        return item;
    }

    public synchronized E pop() {

        if (top == null) {
            throw new EmptyStackException();
        }

        E temp = (E) top.item;
        top = top.next;
        size--;
        return temp;
    }
}
