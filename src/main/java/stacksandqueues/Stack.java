package stacksandqueues;




import java.util.NoSuchElementException;

public class Stack<T> {


    /**
     * Creates an empty Stack when instantiated
      *
     */

    private Node<T> top = null;



    /**
     * Returns true if this stack is empty
     *
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty(){
        return top == null;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return the number of items in this stack
     */
//    public int size(){
//        return top;
//    }


    /**
     * Takes in any value as an argument and adds a new node with that value
     * to the top of the stack
     *
     * @param element
     */
    public Stack<T> push(T element){
        Node<T> newItem = new Node<T>(element, this.top);

        if (top == null){
            top = newItem;
        }
        else{
            newItem.next = top;
            top = newItem;
        }
        return this;

    }

    /**
     * Removes and returns the item most recently added to this stack
     *
     * @return the item most recently added to this stack
     * @throws NoSuchElementException if this stack is empty
     */

    public T pop(){
        if (top == null){
            throw new NoSuchElementException("The stack is empty");
        }
        T output = top.value;
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
        if(top == null){
            throw new NoSuchElementException("The stack is empty");
        }
        return top.value;
    }



}
