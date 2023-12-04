package structure;

public class Node<E> {
    protected Node<E> next;
    protected E item;

    Node() {
        item = null;
        next = null;
    }
    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    };
}
