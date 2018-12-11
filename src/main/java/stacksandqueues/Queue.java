package stacksandqueues;

public class Queue<T> {

    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value) {
        Node newNode = new Node(value);
        if (this.front == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    public T dequeue() {
        if (this.front == null) {
            return null;
        } else {
            T frontNode = this.front.value;
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }
            return frontNode;
        }
    }

    public T peek() {
        if (this.front != null){
            return this.front.value;
        }else{
            return null;
        }
    }

}


