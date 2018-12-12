package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {

    Queue testQueue;

    @Before
    public void beforeTestSetUp(){
        testQueue = new Queue<>();
    }

    @Test
    public void testQueue() {

      testQueue.enqueue(1);
      testQueue.enqueue(2);
      testQueue.enqueue(3);


      assertEquals(1, testQueue.dequeue());
      assertEquals(2, testQueue.dequeue());
      assertEquals(3, testQueue.dequeue());

    }

    @Test
    public void testSameValueQueue() {

        testQueue.enqueue(2);
        testQueue.enqueue(2);
        testQueue.enqueue(2);


        assertEquals(2, testQueue.dequeue());
        assertEquals(2, testQueue.dequeue());
        assertEquals(2, testQueue.dequeue());

    }

    @Test
    public void testUnorderedeQueue() {

        testQueue.enqueue(4);
        testQueue.enqueue(2);
        testQueue.enqueue(8);


        assertEquals(4, testQueue.dequeue());
        assertEquals(2, testQueue.dequeue());
        assertEquals(8, testQueue.dequeue());

    }

    @Test
    public void testOneDequeue() {

        testQueue.enqueue(8);

        assertEquals(8, testQueue.dequeue());

    }

    @Test(expected = NoSuchElementException.class)
    public void testDequeueOnEmpty(){
        testQueue.dequeue();
    }

    @Test
    public void testPeek() {

        testQueue.enqueue(4);
        testQueue.enqueue(2);
        testQueue.enqueue(8);
        testQueue.enqueue(1);
        testQueue.enqueue(5);
        testQueue.enqueue(6);


        assertEquals(4, testQueue.peek());
        testQueue.dequeue();

        assertEquals(2, testQueue.peek());
        testQueue.dequeue();

        assertEquals(8, testQueue.peek());

    }




}