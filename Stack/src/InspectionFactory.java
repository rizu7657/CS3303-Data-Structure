import entity.Inspection;
import structure.LinkedStack;

public class InspectionFactory {
    public static void main(String[] args) {
        System.out.println("Inspection Factory is open! Initiating inspection...");

//        Inspection inspection1 = new Inspection("Tyre Test", 2);
//        Inspection inspection2 = new Inspection("Engine Test", 1);
//        Inspection inspection3 = new Inspection("Body Test", 0);

        LinkedStack stack = new LinkedStack();
        stack.push(2);
        stack.push(1);
        stack.push(0);

        System.out.println("Inspecting at #" + stack.pop());
        System.out.println("Inspecting at #" + stack.pop());
        System.out.println("Inspecting at #" + stack.pop());
    }
}