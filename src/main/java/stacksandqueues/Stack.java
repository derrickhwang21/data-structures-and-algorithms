package stacksandqueues;

public class Stack {
        Node head;
        private int n;



    /**
     * Creates an empty Stack when instantiated
      *
     */
    public void top(){
        head = null;
        n = 0;

    }

    /**
     * Returns true if this stack is empty
     *
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty(){
        return head == null;
    }

    
    public int size(){
        return n;
    }


}
