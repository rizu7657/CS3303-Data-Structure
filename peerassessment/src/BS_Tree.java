import java.util.Scanner;

public class BS_Tree {
    public class Node // create a Node class
    {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) // constructor of Node class
        {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public Node root; // crete object of Node class
    // create constructor of class BST

    public BS_Tree() {
        this.root = null;
    }

    // declare inser method to insert an item in tree
    public void BSTinsert(int newval) {
        this.root = insert(root, newval);
    }

    public Node insert(Node root, int newval) {
        if (root == null) // case when root is null
        {
            root = new Node(newval); // insert the value as root node
            return root; // return the current node to its subtree
        } else if (root.val >= newval) {
            root.left = insert(root.left, newval);
        } else {
            root.right = insert(root.right, newval);
        }
        return root;
    }

    // create search method to search a value in the tree
    public boolean BSTsearch(int val, int total) {
        return BSTsearch(this.root, val, total);
    }

    private boolean BSTsearch(Node root, int val, int total) {
        if (root == null) // if root node is null
        {
            System.out.println("Element not found!!");
            return false;
        } else if (root.val == val) {
            System.out.println("Element found after " + total + 1 + " iterations.");
//            return true;
            total = total + 1;
            return BSTsearch(root.left, val, total);
        }
        total = total + 1;
        return BSTsearch(root.right, val, total);
    }

    public void BSTPreOrder() // method for preOrder trvaersal
    {
        BSTPreOrder(root);
        System.out.println();
    }

    public void BSTPreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        BSTPreOrder(root.left);
        BSTPreOrder(root.right);
    }

    public static void main(String[] args) {
        // Creating the object of the program's BinarySearchTree class
        BS_Tree new_bst = new BS_Tree();
        Scanner x = new Scanner(System.in);
        int c;
        do {
            System.out.println("Insert an integer value that is to be inserted into the binary search tree: ");
            int val = x.nextInt();
            new_bst.BSTinsert(val);
            System.out.println("Is this the last element? Please enter the specified option (1 for Yes/0 for N): ");
            c = x.nextInt();
        } while (c != 1);
        System.out.println("The tree's elements are: ");
        new_bst.BSTPreOrder();
        System.out.println("Enter an integer that to be searched in tree:");
        int search_value = x.nextInt();
        new_bst.BSTsearch(search_value, 0);
    }
}
