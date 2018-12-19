package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
      Node<T> root;




    /**
     * first visits the root node, then the left subtree, and finally the right subtree
     *
     */
    public List preOrder(){
    List result = new ArrayList<>();
    Node current = root;

    recursivePreOrder(current, result);
    return result;

    }

    /**
     * Recursive method for preOrder
     */
    public void recursivePreOrder(Node root, List values){
        if(root != null) {

            values.add(root.value);
            recursivePreOrder(root.left, values);
            recursivePreOrder(root.right, values);
        }


    }


    /**
     * first visiting the left sub-tree, then the root node, and finally the right subtree
     *
     */
    public List inOrder(){
        List result = new ArrayList<>();
        Node current = root;

        recursiveInOrder(current, result);
        return result;

        }

    /**
     * recursive method for inOrder
     */
    public void recursiveInOrder(Node root, List values){
        if (root != null) {
            recursiveInOrder(root.left, values);
            values.add(root.value);
            recursiveInOrder(root.right, values);
        }
    }

    /**
     * vists the left subtree, the right subtree and the root node at the end
     *
     */
        public List postOrder(){
            List result = new ArrayList<>();
            Node current = root;

            recursivePostOrder(current, result);

            return result;

        }

    public void recursivePostOrder(Node root, List values){
        if(root != null) {
            recursivePostOrder(root.left, values);
            recursivePostOrder(root.right, values);
            values.add(root.value);
        }

    }


}
