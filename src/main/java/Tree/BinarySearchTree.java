package Tree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    Node<T> root;

    /**
     * recursiveAdd - recursive helper to insert new node
     *
     * If the new node's value is lower than the current node's, we go to the left child
     * If the new node's value is greater than the current node's we go the right child
     * when the current node is null, we've reached a leaf node and we can insert the new node in that position

     * @return current - Node to add
     */
    public Node recursiveAdd(Node<T> current, T value){
        if (current == null){
            return new Node(value);
        }

        if (value.compareTo(current.value) < 0){
            current.left = recursiveAdd(current.left, value);
        }
        else if (value.compareTo(current.value) > 0){
            current.right = recursiveAdd(current.right, value);
        }
        else{
            return current;
        }
        return current;
    }

    /**
     * add - starts recursion from the root node
     */
    public void add(T value){
        root = recursiveAdd(root, value);
    }

    /**
     * searchNodeRecursive - Recursive helper method that traverses the tree
     *
     * @return value of null or node
     */
    public Node<T> searchNodeRecursive(Node<T> current, T value){
        if (current == null){
            return null;
        }
        if (value == current.value){
            return current;
        }
        return value.compareTo(current.value) < 0 ? searchNodeRecursive(current.left, value) : searchNodeRecursive(current.right, value);
    }

    /**
     * search - Brings in a value of node, and returns the node with the desired value
     *
     *
     */
    public Node<T> search(T value){
        return searchNodeRecursive(root, value);

    }

    /**
     * containsNodeRecursive - Recursive helper method that traverses the tree
     */
    public boolean containsNodeRecursive(Node<T> current, T value){
        if (current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }
        return value.compareTo(current.value) < 0 ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
    }

    /**
     * containsNode - method to traverse the tree to check if the node with T value exists
     * @param value to find
     * @return boolean
     */
    public boolean containsNode(T value){
        return containsNodeRecursive(root, value);
    }

}
