package structure;

public class IntNode {
    protected IntNode next;
    protected int value;

    public IntNode(int value, IntNode next) {
        this.value = value;
        this.next = next;
    };
}
