package Tree;

public class Tree<T extends Comparable<T>> {
        Node<T> root;





    /**
     * first visits the root node, then the left subtree, and finally the right subtree
     * @param node
     */
    public void preOrder(Node<T> node){
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
    public void inOrder( Node<T> node){
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
        public void postOrder(Node<T> node){
            if(node != null){
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(" " + node.value);
            }

        }


}
