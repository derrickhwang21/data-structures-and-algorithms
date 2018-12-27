package QueueWithStacks;


import stacksandqueues.Node;
import stacksandqueues.Stack;

public class PseudoQueue<T> extends Stack{

    public Stack<T> stackOne;
    public Stack<T> stackTwo;

    public PseudoQueue() {
        stackOne = new Stack();
        stackTwo = new Stack();
    }

    /**
     *
     * @param value
     */
    public void enqueue(T value) {
        if (stackOne.peek() == null && stackTwo.peek() == null) {
            stackOne.push(value);
        } else if (stackOne.peek() == null){
            stackOne.push(value);}
        else{
            while (stackTwo.peek() != null) {
//                        Node<T> temp = new Node<>(value);

                stackOne.push(stackOne.pop().value);
            }
            stackOne.push(value);

        }
    }

    public Node<T> dequeue() {
        if (stackOne.peek() == null) {
            return null;
        } else {
            return stackOne.pop();
        }


    }
}
