package stacksandqueues;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.GenericArrayType;

import static org.junit.Assert.*;

public class StackTest {




    @Test
    public void testPush() {
        Stack<Integer> testList = new Stack<>();

        for (int i = 0; i < 10000; i++) {
            Integer temp = (int) Math.random() * 100;
            testList.push(temp);
            assertEquals(temp, testList.peek());


        }




    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void size() {
    }

    @Test
    public void push() {
    }

    @Test
    public void pop() {
    }

    @Test
    public void peek() {
    }
}