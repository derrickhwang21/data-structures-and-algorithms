package stacksandqueues;

public class Node<T> {
     public T value;
     public Node<T> next;


    public Node(T element, Node next){

        this.value = element;
        this.next = next;
    }


}
