package QueueWithStacks;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PseudoQueueTest {

    PseudoQueue testPseudoQueue;

    @Before
    public void beforeTestSetUp(){
        testPseudoQueue = new PseudoQueue();
    }

    @Test
    public void testEnqueue() {

        testPseudoQueue.enqueue(1);
        testPseudoQueue.enqueue(3);
        assertEquals(1, testPseudoQueue.dequeue());

//        testPseudoQueue.enqueue(6);
//        testPseudoQueue.enqueue(4);
//        testPseudoQueue.enqueue(2);
//
//        assertEquals(6, testPseudoQueue.dequeue());
//        assertEquals(4, testPseudoQueue.dequeue());
//        assertEquals(2, testPseudoQueue.dequeue());

    }


}