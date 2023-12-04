package structure;

public class IntNode {
    protected IntNode next;
    protected int value;

    IntNode() {
        value = 0;
        next = null;
    }
    public IntNode(int value, IntNode next) {
        this.value = value;
        this.next = next;
    };
}
