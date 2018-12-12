package QueueWithStacks;


import stacksandqueues.Stack;

public class PseudoQueue<T> {

    protected Stack<T> stackOne;
    protected Stack<T> stackTwo;

    public PseudoQueue() {
        stackOne = new Stack();
        stackTwo = new Stack();
    }

    public void enqueue(T value) {
        if (stackOne.peek() == null) {
            this.stackOne.push(value);
        } else {
            while (stackOne != null) {
                stackTwo.push(stackOne.pop());
            }
            stackOne.push(value);
            while (stackTwo.peek() != null) {
                stackOne.push(stackTwo.pop());
            }
        }
    }

    public T dequeue() {
        if (stackOne.peek() == null) {
            return null;
        } else {
            return stackOne.pop();
        }


    }
}
