package Tree;

public class Tree {
        Node root;

    /**
     * Insertion of a new node
     *
     * If the new node's value is lower than the current node's, we go to the left child
     * If the new node's value is greater than the current node's we go the right child
     * when the current node is null, we've reached a leaf node and we can insert the new node in that position

     * @return
     */
    public Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = addRecursive(current.left, value);
        }
        else if (value > current.value){
            current.right = addRecursive(current.right, value)
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
        root = addRecursive(root, value);
    }


    /**
     * first visits the root node, then the left subtree, and finally the right subtree
     * @param node
     */
    public void preOrder(Node node){
        if (node != null){
            System.out.print(" " + node.value);
            preOrder(node.left);
            preOrder(node.right);
        }

        }


    /**
     * first visiting the left sub-tree, then the root node, and finally the right subtree
     * @param node
     */
    public void inOrder( Node node){
        if (node != null){
            inOrder(node.left);
            System.out.println(" " + node.value);
            inOrder(node.right);
        }

        }

    /**
     * vists the left subtree, the right subtree and the root node at the end
     * @param node
     */
        public void postOrder(Node node){
            if(node != null){
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(" " + node.value);
            }

        }


}
