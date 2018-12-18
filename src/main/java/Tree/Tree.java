package Tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<T extends Comparable<T>> {
      Node<T> root;









    /**
     * first visits the root node, then the left subtree, and finally the right subtree
     *
     */
    public ArrayList<Node> preOrder(){
    ArrayList<Node> result = new ArrayList<Node>();
    Node current = root;

    recursiveInOrder(current, result);

    return result;



    }

    /**
     * Recursive method for preOrder
     */
    public void recursivePreOrder(Node node, List<Node> values){
        if(node == null){
            return;
        }
        recursivePreOrder(node.left, values);
        values.add(node);
        recursivePreOrder(node.right, values);

    }


    /**
     * first visiting the left sub-tree, then the root node, and finally the right subtree
     * @param node
     */
    public void inOrder( Node<T> node){
        if (node != null){
            inOrder(node.left);
            System.out.println(" " + node.value);
            inOrder(node.right);
        }

        }

    /**
     * recursive method for inOrder
     */
    public void recursiveInOrder(Node node, List<Node> list){
        if (node == null){
            return;
        }

        list.add(node);
        recursivePreOrder(node.left, list);
        recursivePreOrder(node.right, list);
    }

    /**
     * vists the left subtree, the right subtree and the root node at the end
     * @param node
     */
        public void postOrder(Node<T> node){
            if(node != null){
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(" " + node.value);
            }

        }


}
