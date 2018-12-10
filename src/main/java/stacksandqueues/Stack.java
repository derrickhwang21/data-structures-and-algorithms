package stacksandqueues;


import java.util.Iterator;

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
        Node<T> newItem = new Node<T>(element);

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

    /**
     * Returns a string representation of this stack
     *
     * @return
     */
//    public String toString(){
//        StringBuilder s = new StringBuilder();
//        for (Object value : this){
//            s.append(value);
//            s.append(' ');
//        }
//        return s.toString();
//    }
//
//
//    public Iterator<Object> iterator(){ return new ListIterator(); }
//
//    private class ListIterator implements Iterator<Object> {
//        private Node current = head;
//        public boolean hasNext(){
//            return current != null;
//        }
//        public void remove(){ throw new UnsupportedOperationException(); }
//
//        public Object next(){
//            if (!hasNext()) throw new NoSuchElementException();
//            Object item = current.value;
//            current = current.next;
//            return item;
//        }
//    }
//
//
//
    private static void printArray(Integer[] anArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(anArray[i]);
        }
        System.out.println(sb.toString());
    }

}
