import entity.Inspection;
import structure.LinkedStack;

import java.util.Random;
import java.util.Stack;

public class InspectionFactory {
    public static void main(String[] args) {
        System.out.println("Inspection Factory is open! Initiating inspection...");

        int n = (int) Math.ceil(Math.random() * 100);

        LinkedStack stack = new LinkedStack();
        for (int i = 0; i < n; i++) {
            stack.push(n - i);
        }

        System.out.println("Inspection has " + n + " stations");

        for (int i = 0; i < n; i++) {
            System.out.println("Inspecting at station #" + stack.pop());
        }
    }
}