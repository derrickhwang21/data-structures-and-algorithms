package TreeIntersection;

import Tree.BinaryTree;
import Tree.Node;

import java.util.*;

public class TreeIntersection {

    public static List<Integer> treeIntersection(BinaryTree BT1, BinaryTree BT2){

        Set existingValues = new HashSet<>();
        List<Integer> commonValues = new ArrayList<>();
        Node currentNode = BT1.root;
        Stack<Node> stack = new Stack<>();

        while(!stack.isEmpty() || currentNode != null) {
            if(currentNode != null){
            existingValues.add(currentNode.value);
            stack.push(currentNode);
            currentNode = currentNode.left;
        }else{
                currentNode = stack.pop();
                existingValues.add(currentNode.value);
                currentNode = currentNode.right;

            }
        }

        currentNode = BT2.root;

        while(currentNode != null){

            if(existingValues.contains(currentNode.value )){
                commonValues.add((Integer)currentNode.value);
                stack.push(currentNode);
                currentNode = currentNode.left;

            }else{
                currentNode = stack.pop();
                currentNode = currentNode.right;

            }

        }


        return commonValues;
    }
}
