import java.util.Stack;

public class InspectionStack {

    private Stack<Integer> inspectionStack; // Stack to store inspection statuses

    // Creating constructor to initialize the stack
    public InspectionStack() {
        inspectionStack = new Stack<>();
    }

    // Creating a method to push an inspection status onto the stack
    public void push(int inspectionStatus) {
        inspectionStack.push(inspectionStatus);
    }

    // Creating a method to pop an item off the stack and print it
    public void popAndPrint() {
        if (!inspectionStack.isEmpty()) {
            int poppedValue = inspectionStack.pop();
            System.out.println("Inspection at Station: " + poppedValue);
        } else {
            System.out.println("No more inspections in the stack.");
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        InspectionStack inspectionStack = new InspectionStack();

        // Push initial inspection statuses onto the stack
        inspectionStack.push(0);
        inspectionStack.push(0);
        inspectionStack.push(0);

        // Simulate inspections at each station
        inspectionStack.popAndPrint(); // Inspection at Station 0
        inspectionStack.popAndPrint(); // Inspection at Station 0
        inspectionStack.popAndPrint(); // Inspection at Station 0

        // Trying to pop more inspections (the output is message "No more inspections in the stack.")
        inspectionStack.popAndPrint();
    }
}
