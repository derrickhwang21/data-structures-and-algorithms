package Tree;

import java.util.Comparator;
import java.util.Map;

/**
 * Node - class for node constructor
 * @param <T>of any type
 */
public class Node<T extends Comparable<T>> {
    public T value;
    public Node<T> left;
    public Node<T> right;

    public Node(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }



}
