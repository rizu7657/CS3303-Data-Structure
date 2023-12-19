//import jeliot.io*;
import java.util.Arrays;
import java.util.Scanner;

class BinarySearchTree {
	
	// main method
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter integers to add to the binary search tree (enter a letter to stop):");

	        // An array to hold integers
	        int[] nums = new int[20]; 

	        int index= 0;

	        // Input integers until a letter is entered
	        // Integers to be added: 10, 5, 12, 3, 1, 13, 7, 2, 4, 14, 9, 8, 6, 11
	        while (scanner.hasNextInt()) {
	            int num = scanner.nextInt();
	            nums[index++] = num;
	        }

	        // Trim the array to fit the number of integers.
	        int[] trimmedNums = Arrays.copyOf(nums, index);

	        BinarySearchTree binarySearchTree = new BinarySearchTree();

	        // Populate the binary search tree with entered integers
	        binarySearchTree.populateTree(trimmedNums);

	        // Prompt the user for the search value
	        System.out.println("Enter the search value:");


	        // Verify input is an integer
	        while (!scanner.hasNextInt()) {
	            scanner.next();  // Move to searchValue
	        }

	        int searchValue; 
	        //Input for searchValue
	        // SearchValue: 9
	        searchValue = scanner.nextInt();

	        // Performs the binary search and displays the result
	        int iterations = binarySearchTree.binarySearch(searchValue);
	        System.out.println("Found search value  " + searchValue + " in: " + iterations + " iterations");

	        scanner.close();
	    }
  
    

 
    public BinarySearchTree() {
    }
    
    private Node root; // The root node of the binary search tree

    // Insert method
    public void insert(int value) {
        root = insert(value, root);
    }

    // Recursive Insert method
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        
        // Sorting by value
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        return node;
    }

    // Populates the binary search tree with an array of integers
    public void populateTree(int[] nums) {
    	for (int i = 0; i < nums.length; i++) {
    	    int num = nums[i];
    	    this.insert(num);
    	}

    }

  
    // Checks if the binary search tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Binary search method that returns the number of iterations required to find the search value
    public int binarySearch(int searchValue) {
        return binarySearch(root, searchValue, 1);
    }

    // Recursive method for binary search in the binary search tree
    private int binarySearch(Node node, int searchValue, int iterations) {
        if (node == null) {
            return -1; // Value not found, terminates
        }

        if (searchValue == node.value) {
            return iterations; // Value found
        } else if (searchValue < node.value) {
            return binarySearch(node.left, searchValue, iterations + 1); // Searches left subtree
        } else if (searchValue > node.value){
            return binarySearch(node.right, searchValue, iterations + 1); // Searches right subtree
        }
		return 0;
    }

   
    // Node class representing left and right nodes in the binary search tree
    public class Node {
        private int value;
        private Node left, right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
        
}
}
