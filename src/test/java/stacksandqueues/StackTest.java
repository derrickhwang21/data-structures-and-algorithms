package stacksandqueues;


import org.junit.Before;
import org.junit.Test;


import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {



    Stack<Integer> testList;

    @Before
    public void beforeTestSetUp(){
        testList = new Stack<>();
    }

    @Test
    public void testPush() {

        for (int i = 0; i < 10000; i++) {
            Integer temp = (int) (Math.random() * 100) - 1;
            testList.push(temp);
            assertEquals(temp, testList.peek());

        }

    }

    @Test
    public void testPush2() {

        for (int i = 0; i < 10; i++) {
            Integer temp = (int) (Math.random() * 100) -1;
            testList.push(temp);
            assertEquals(temp, testList.peek());

        }

    }

    @Test
    public void testPushEmpty() {

        for (int i = 0; i < 0; i++) {
            Integer temp = (int) (Math.random() * 100) -1;
            testList.push(temp);
            assertEquals(temp, testList.peek());


        }
    }


    @Test
    public void isEmpty() {

        assertEquals(true, testList.isEmpty());
        testList.push(1);
        assertEquals(false, testList.isEmpty());
        testList.pop();
        assertEquals(true, testList.isEmpty());
    }


    @Test(expected = NoSuchElementException.class)
    public void testPopEmpty() {
        testList.pop();

    }

    @Test
    public void testOneDequeue(){
        Integer[] testData = new Integer[10000];

        for(int i = 0; i < 10000; i++){
            int temp = (int) (Math.random() * 100) -1;
            testData[i] = temp;
            testList.push(temp);
        }

        for (int i = testData.length - 1; i >= 0; i--){
            assertEquals(testData[i], testList.pop());
        }
    }

    @Test
    public void testPop2(){
        Integer[] testData = new Integer[100];

        for(int i = 0; i < 100; i++){
            int temp = (int) (Math.random() * 100) -1;
            testData[i] = temp;
            testList.push(temp);
        }

        for (int i = testData.length - 1; i >= 0; i--){
            assertEquals(testData[i], testList.pop());
        }
    }

    @Test
    public void peek() {
        for (int i = 0; i < 10000; i++) {
            Integer temp = (int) (Math.random() * 100) -1;
            testList.push(temp);
            assertEquals(temp, testList.peek());
        }
    }

    @Test
    public void testPeek2() {

        for (int i = 0; i < 10; i++) {
            Integer temp = (int) (Math.random() * 100) -1;
            testList.push(temp);
            assertEquals(temp, testList.peek());

        }

    }

    @Test
    public void testPeekEmpty() {

        for (int i = 0; i < 0; i++) {
            Integer temp = (int) (Math.random() * 100) -1;
            testList.push(temp);
            assertEquals(temp, testList.peek());


        }
    }
}