
public class StackImplementation {

    private int[] stack;
    private int top;

    public StackImplementation(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = item;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedItem = stack[top];
            top--;
            return poppedItem;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(3);

        // Add 3 items to stack
        stack.push(2);
        stack.push(1);
        stack.push(0);

        // Pop 3 items from stack and print
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}