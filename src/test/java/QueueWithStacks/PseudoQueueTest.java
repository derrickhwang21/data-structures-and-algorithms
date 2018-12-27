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

        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.enqueue(4);

        Node result = testQueue.dequeue();
//         Node newNode = new Node(testQueue.peek());
        Node expected = new Node(1, null);

        assertEquals(expected, result);

    }

    @Test
    public void testWithMultipleEnqueue() {
        PseudoQueue testQueue = new PseudoQueue<>();
        Stack testStack = new Stack<>();

        testStack.push(2);
        testQueue = (PseudoQueue) testStack;
        testQueue.enqueue(3);
        System.out.println(testQueue.peek());
    }
        @Test public void testPseudoQueue() {

            PseudoQueue<Integer> test = new PseudoQueue<>();
            assertEquals( null, test.stackOne.peek());
            assertEquals( null, test.stackTwo.peek());


        }

        @Test
        public void testEnqueue() {

            PseudoQueue test = new PseudoQueue();
            test.enqueue(1);
            assertEquals( 1, test.stackOne.peek());
            test.enqueue(2);
            assertEquals( 2, test.stackOne.peek());
            test.enqueue(3);
            assertEquals( 3, test.stackOne.peek());


        }

        @Test
        public void testDequeque() {

            PseudoQueue<Integer> test = new PseudoQueue<Integer>();
            test.enqueue(1);
            test.enqueue(2);
            test.enqueue(3);




            assertEquals( 1, test.dequeue());
            assertEquals( 2, test.dequeue());
            assertEquals( 3, test.dequeue());

        }




//        int result = testQueue.peek();
//
//        assertEquals(7, result);



//    @Test
//    public void testEmptyEnqueue(){
//
//        testPseudoQueue.enqueue(null);
//        assertTrue(testPseudoQueue.dequeue() == null);
//    }


}