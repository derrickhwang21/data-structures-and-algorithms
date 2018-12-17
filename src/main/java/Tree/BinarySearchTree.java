package Tree;

public class BinarySearchTree {
    Node root;

    /**
     * Insertion of a new node
     *
     * If the new node's value is lower than the current node's, we go to the left child
     * If the new node's value is greater than the current node's we go the right child
     * when the current node is null, we've reached a leaf node and we can insert the new node in that position

     * @return
     */
    public Node recursiveAdd(Node current, int value){
        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = recursiveAdd(current.left, value);
        }
        else if (value > current.value){
            current.right = recursiveAdd(current.right, value);
        }
        else{
            return current;
        }
        return current;
    }

    /**
     * starts recursion from the root node
     */
    public void add(int value){
        root = recursiveAdd(root, value);
    }

    /**
     * Recursive method that traverses the tree
     */
    public boolean containsNodeRecursive(Node current, int value){
        if (current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }
        return value < current.value ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value){
        return containsNodeRecursive(root, value);
    }

}
