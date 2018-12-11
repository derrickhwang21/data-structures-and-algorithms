package stacksandqueues;

public class Queue<T> {

    private Node<T> front = null;

    public Queue<T> enqueue (T element){
        Node<T> newItem = new Node<T>(element);

        if(front == null){
            front = newItem;
        }
        else{
            newItem.next = front;
            front = newItem;
        }
        return this;
    }

    public Queue<T> dequeue (T element){
        return this;
    }

    public T peek(){
        return front.value;
    }

}
