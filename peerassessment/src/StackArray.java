public class StackArray {
	private static int size = 3;
	private int top; // top of the stack
	private final int[] stack; // storing in an array

	// Constructor to initialize the stack
	public StackArray() {
		stack = new int[size];
		top = -1; // to ensure an empty stack
	}

	// Push operation adds an entry to the stack
	public int push(final int stationNumber) {
		if (top < size - 1) { // checks if there is space in the stack
			stack[++top] = stationNumber; // adds to the stack
			return stationNumber;
		} else {
			System.out.println("Cannot push more after:" + stationNumber);
			return -1;
		}
	}

	// Pop operation to remove and return the top element from the stack
	public int pop() {
		if (top >= 0) { // checks if the stack is not empty
			final int popElement = stack[top--]; // get the top element, then pop it.
			return popElement; // return the popped element
		} else {
			System.out.println("Empty Stack, cannot push");
			return -1;
		}
	}

	public static void main(final String[] args) {
		final StackArray stack = new StackArray();

		for (int i = 0; i < 3; i++) {
			System.out.println("Call at Station 1: " + stack.push(i));
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Inspection at Station " + (i + 1) + ": " + stack.pop());
		}
	}
}
