package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
      Node<T> root;





    /**
     * preOrder - vists the root node, then the left subtree, and finally the right subtree
     * @return results in a collection of data any type
     */
    public List preOrder(){
    List result = new ArrayList<>();
    Node current = root;

    recursivePreOrder(current, result);
    return result;

    }

    /**
     * recursivePreorder - recursive helper method for preOrder
     * @param root current root node
     * @param values collection of any type data
     */
    private void recursivePreOrder(Node root, List values){
        if(root != null) {

            values.add(root.value);
            recursivePreOrder(root.left, values);
            recursivePreOrder(root.right, values);
        }


    }


    /**
     * inOrder - first visiting the left sub-tree, then the root node, and finally the right subtree
     * @return results in a collection of data any type
     */
    public List inOrder(){
        List result = new ArrayList<>();
        Node current = root;

        recursiveInOrder(current, result);
        return result;

        }


    /**
     * recursivePreorder - recursive helper method for preOrder
     * @param root current root Node
     * @param values collection of any type data
     */
    private void recursiveInOrder(Node root, List values){
        if (root != null) {
            recursiveInOrder(root.left, values);
            values.add(root.value);
            recursiveInOrder(root.right, values);
        }
    }

    /**
     * postOrder - vists the left subtree, the right subtree and the root node at the end
     * @return results in a collection of data any type
     */
        public List postOrder(){
            List result = new ArrayList<>();
            Node current = root;

            recursivePostOrder(current, result);

            return result;

        }

    /**
     * recursivePreorder - recursive helper method for preOrder
     * @param root current root Node
     * @param values collection of any type data
     */
    private void recursivePostOrder(Node root, List values){
        if(root != null) {
            recursivePostOrder(root.left, values);
            recursivePostOrder(root.right, values);
            values.add(root.value);
        }

    }


}
