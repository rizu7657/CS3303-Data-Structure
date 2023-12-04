package structure;

import java.util.EmptyStackException;

public class LinkedStack {
    private IntNode top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    };

    public LinkedStack(int intValue) {
        top = new IntNode(intValue, top);
        size = 0;
    }

    public int push(int intValue) {
        top = new IntNode(intValue, top);
        size++;
        return intValue;
    }

    public synchronized int pop() {

        if (top == null) {
            throw new EmptyStackException();
        }

        int temp = top.value;
        top = top.next;
        size--;
        return temp;
    }
}
