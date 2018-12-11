package stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {

    Queue<Integer> testList = new Queue<>();

    @Test
    public void testEnqueue() {

        for (int i = 0; i < 10000; i++) {
            Integer temp = (int) Math.random() * 100;
            testList.enqueue(temp);
            assertEquals(temp, testList.peek());

        }
    }

    @Test
    public void testEnqueue2() {

        for (int i = 0; i < 100; i++) {
            Integer temp = (int) Math.random() * 100;
            testList.enqueue(temp);
            assertEquals(temp, testList.peek());

        }
    }

    @Test
    public void testEnqueueEmpty() {

        for (int i = 0; i < 0; i++) {
            Integer temp = (int) Math.random() * 100;
            testList.enqueue(temp);
            assertEquals(temp, testList.peek());

        }
    }

    @Test
    public void testDequeue() {
        Integer[] testData = new Integer[10000];

        for(int i = 0; i < 10000; i++){
            int temp =  (int) Math.random() * 100;
            testData[i] = temp;
            testList.enqueue(temp);
        }

        for (int i = testData.length - 1; i >= 0; i--){
            assertEquals(testData[i], testList.dequeue());
        }
    }

    @Test
    public void testDequeue2() {
        Integer[] testData = new Integer[100];

        for(int i = 0; i < 100; i++){
            int temp =  (int) Math.random() * 100;
            testData[i] = temp;
            testList.enqueue(temp);
        }

        for (int i = testData.length - 1; i >= 0; i--){
            assertEquals(testData[i], testList.dequeue());
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testDequeEmpty() {
        testList.dequeue();

    }

    @Test
    public void peek() {
        for (int i = 0; i < 10000; i++) {
            Integer temp = (int) Math.random() * 100;
            testList.enqueue(temp);
            assertEquals(temp, testList.peek());
        }
    }

    @Test
    public void testPeek2() {

        for (int i = 0; i < 10; i++) {
            Integer temp = (int) Math.random() * 100;
            testList.enqueue(temp);
            assertEquals(temp, testList.peek());

        }

    }

    @Test
    public void testPeekEmpty() {

        for (int i = 0; i < 0; i++) {
            Integer temp = (int) Math.random() * 100;
            testList.enqueue(temp);
            assertEquals(temp, testList.peek());


        }
    }
}