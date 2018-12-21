package stacksandqueues;

public class Node<T> {
     public T value;
     public Node next;


    public Node(T element, Node next){

        this.value = element;
        this.next = next;
    }

    public Node(T element){
        this.value =element;
        this.next = null;
    }


}
