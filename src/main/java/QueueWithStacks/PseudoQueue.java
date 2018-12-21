package QueueWithStacks;


import stacksandqueues.Node;
import stacksandqueues.Stack;

public class PseudoQueue<T> extends Stack{

    private Stack<T> stackOne;
    private Stack<T> stackTwo;

//    public PseudoQueue() {
//        stackOne = new Stack();
//        stackTwo = new Stack();
//    }

    /**
     *
     * @param value
     */
    public void enqueue(T value) {
        if (stackOne.peek() == null) {
            this.stackOne.push(value);
        } else {
            while (stackOne != null) {
                stackTwo.push(stackOne.pop().value);
            }
            stackOne.push(value);
            while (stackTwo.peek() != null) {
                stackOne.push(stackTwo.pop().value);
            }
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
