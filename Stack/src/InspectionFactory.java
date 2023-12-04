import entity.Inspection;
import structure.LinkedStack;

public class InspectionFactory {
    public static void main(String[] args) {
        System.out.println("Inspection Factory is open! Initiating inspection...");

        LinkedStack stack = new LinkedStack();
        stack.push(2);
        stack.push(1);
        stack.push(0);

        System.out.println("Inspecting at #" + stack.pop());
        System.out.println("Inspecting at #" + stack.pop());
        System.out.println("Inspecting at #" + stack.pop());
    }
}