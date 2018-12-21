package stacksandqueues;




import java.util.NoSuchElementException;

public class Stack<T> {


    /**
     * Creates an empty Stack when instantiated
      *
     */

    protected Node<T> top;

    public Stack(){
        top = null;
    }

    /**
     * Returns true if this stack is empty
     *
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty(){
        return top == null;
    }





    /**
     * Takes in any value as an argument and adds a new node with that value
     * to the top of the stack
     *
     * @param element
     */
    public void push(T element){
        Node newItem = new Node(element, this.top);
        top = newItem;
    }

    /**
     * Removes and returns the item most recently added to this stack
     *
     * @return the item most recently added to this stack
     * @throws NoSuchElementException if this stack is empty
     */

    public Node<T> pop(){
        Node<T> output = top;
        top = top.next;

        return output;
    }

    /**
     * Returns (but does not remove) the item most recently added to this stack
     *
     * @return the item most recently added to this stack
     * @throws NoSuchElementException if this stack is empty
     *
     */
    public T peek(){
        return top != null ? top.value : null;
    }



}
