package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
      Node<T> root;


//    public BinaryTree(Node<T> root){
//        this.root = root;
//    }
//

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
    public ArrayList<T> inOrder(){
        ArrayList<T> result = new ArrayList<>();
        Node current = root;

        recursiveInOrder(current, result);
        return result;

        }

    /**
     * recursive method for inOrder
     */
    public void recursiveInOrder(Node<T> node, ArrayList root){
        if (node != null) {
            recursiveInOrder(node.left, root);
            root.add(node);
            recursiveInOrder(node.right, root);
        }
    }

    /**
     * vists the left subtree, the right subtree and the root node at the end
     *
     */
        public ArrayList<T> postOrder(){
            ArrayList<T> result = new ArrayList<>();
            Node current = root;

            recursivePostOrder(current, result);

            return result;

        }

    public void recursivePostOrder(Node<T> root, ArrayList values){
        if(root != null) {
            recursivePostOrder(root.left, values);
            recursivePostOrder(root.right, values);
            values.add(root);
        }

    }


}
