public class BinarySearchTree {
    public static void main(String[] args) {
        BSTNode tree = new BSTNode(10);
        tree.insert(tree,5);
        tree.insert(tree,12);
        tree.insert(tree,3);
        tree.insert(tree,1);
        tree.insert(tree,13);
        tree.insert(tree,7);
        tree.insert(tree,2);
        tree.insert(tree,4);
        tree.insert(tree,14);
        tree.insert(tree,9);
        tree.insert(tree,8);
        tree.insert(tree,6);
        tree.insert(tree,11);

        Integer searchIterations = tree.search(tree, 9, 0);
        System.out.println("Searching for 9 took " + searchIterations + " iterations.");
    }
}
