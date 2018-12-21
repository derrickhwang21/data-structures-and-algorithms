package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {

    protected Node<T> front;
    protected Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value) {
        Node newNode = new Node(value, null);
        if (this.front == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = this.rear.next;
        }
    }

    public T dequeue() {
        if (front == null) {
            throw new NoSuchElementException();
        } else {
            T frontNode = front.value;
            if (rear == front) {
                rear = null;
            }
            front = front.next;
            return frontNode;
        }
    }

    public T peek(){
        return front != null ? front.value : null;
    }
}


