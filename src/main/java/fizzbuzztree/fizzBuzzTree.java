package fizzbuzztree;

import Tree.BinaryTree;
import Tree.Node;

public class fizzBuzzTree {

    public BinaryTree fizzBuzzTree(BinaryTree tree){

        iterativeSearchHelper(tree.root);
        return tree;
    }

    private void iterativeSearchHelper(Node root){
        if(root == null) {
            return;
        }
        if((Integer) root.value % 15 == 0) {
            root.value = "FizzBuzz";
        }
        else if((Integer)root.value % 3 == 0) {
            root.value = "Fizz";
        }
        else if((Integer)root.value % 5 == 0) {
            root.value = "Buzz";
        }


        iterativeSearchHelper(root.left);
        iterativeSearchHelper(root.right);
    }

}
