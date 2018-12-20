package Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {



    public Node<T> root;
    private Comparator<T> comparator;

    public void BST()
    {
        root = null;
        comparator = null;
    }

    public void BST(Comparator<T> comp)
    {
        root = null;
        comparator = comp;
    }

    private int compare(T x, T y)
    {
        if(comparator == null) return x.compareTo(y);
        else
            return comparator.compare(x,y);
    }


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
    protected void recursivePreOrder(Node root, List values){
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
    protected void recursiveInOrder(Node root, List values){
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
    protected void recursivePostOrder(Node root, List values){
        if(root != null) {
            recursivePostOrder(root.left, values);
            recursivePostOrder(root.right, values);
            values.add(root.value);
        }

    }


    /**
     * Yet to start
     * @param bt
     */
    public void breadthFirst(BinaryTree<T> bt){

    }

}
