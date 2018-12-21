package QueueWithStacks;

import org.junit.Before;
import org.junit.Test;
import stacksandqueues.Node;
import stacksandqueues.Stack;


import static org.junit.Assert.*;

public class PseudoQueueTest {



    @Test
    public void testDequeue() {
        PseudoQueue<Integer> testQueue = new PseudoQueue<>();

        testQueue.push(1);
        testQueue.push(2);
        testQueue.push(3);
        testQueue.push(4);

         Node newNode = new Node(testQueue.peek());


        assertEquals(1, testQueue.dequeue());

    }

    @Test
    public void testWithMultipleEnqueue() {
        PseudoQueue testQueue = new PseudoQueue<>();
        Stack testStack = new Stack<>();

        testStack.push(2);
        testQueue = (PseudoQueue) testStack;
        testQueue.enqueue(3);
        System.out.println(testQueue.peek());






//        int result = testQueue.peek();
//
//        assertEquals(7, result);

    }

//    @Test
//    public void testEmptyEnqueue(){
//
//        testPseudoQueue.enqueue(null);
//        assertTrue(testPseudoQueue.dequeue() == null);
//    }


}