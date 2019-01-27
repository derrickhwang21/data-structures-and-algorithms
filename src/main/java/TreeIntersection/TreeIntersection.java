package TreeIntersection;

import Tree.BinaryTree;
import Tree.Node;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TreeIntersection {

        public static ArrayList treeIntersection(BinaryTree one, BinaryTree two){
            ArrayList commonValue = new ArrayList();
            HashSet treeOne = toSet(one);
            HashSet treeTwo = toSet(two);
            for (Object n : treeOne){
                if (treeTwo.contains(n)){
                    commonValue.add(n);
                }
            }
            return commonValue;
        }

        private static HashSet toSet(BinaryTree input){
            HashSet setOfNodes = new HashSet();
            List nodes = input.inOrder();
            for (Object n : nodes.toArray()){
                setOfNodes.add(n);
            }
            return setOfNodes;
        }

}
