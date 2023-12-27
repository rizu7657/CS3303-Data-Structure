
public class BSTNode {
    int value;
    BSTNode left;
    BSTNode right;

    public BSTNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public boolean isLeaf() {
        return (left == null) && (right == null);
    }
    public BSTNode insert(BSTNode tree, int value) {
        if (tree == null) return new BSTNode(value);

        if (tree.value > value) {
            tree.setLeft(insert(tree.left, value));
        } else {
            tree.setRight(insert(tree.right, value));
        }
        return tree;
    }

    public Integer search(BSTNode tree, int value, int searchIteration) {
        if (tree == null) return null;

        if (tree.value == value) {
            return searchIteration;
        } else if (tree.getValue() > value) {
            return search(tree.left, value, searchIteration+1);
        } else {
            return search(tree.right, value, searchIteration+1);
        }
    }
}