package link;
import org.hamcrest.core.IsNull;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;



public class LinkedListTest {

    LinkedList testList = new LinkedList();

    @Test
    public void printTest(){


        testList.insert(1);

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));

        testList.print();
        String actualOutput = outString.toString();

        assertEquals("1 ", actualOutput);

    }

    @Test
    public void printTest2(){



        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));

        testList.print();
        String actualOutput = outString.toString();


        assertEquals("4 3 2 1 ", actualOutput);

    }

    @Test
    public void printTest3(){




        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));

        testList.print();
        String actualOutput = outString.toString();

        assertTrue(actualOutput.isEmpty());

    }



    @Test
    public void testInsert() {

        testList.insert(1);


        assertEquals("output should equal to 1", 1, testList.head.data);
    }

    @Test
    public void testInsert2() {

        testList.insert(4);
        testList.insert(2);


        ArrayList<Integer> testAList = new ArrayList<>();
        testAList.add(2);
        testAList.add(4);

        assertEquals("output should equal to 1", testAList , testList.toIntegerArray());

    }

    @Test
    public void testInsert3() {

        testList.insert(1);
        testList.insert(2);
        testList.insert(3);




        assertEquals("output should equal to 1", 1, testList.head.next.next.data);
    }


    @Test
    public void includes1() {


        testList.insert(1);
        testList.insert(20);
        testList.insert(300);

        assertTrue( testList.includes(1));
        assertTrue( testList.includes(20));
        assertTrue( testList.includes(300));
    }

    @Test
    public void includes2() {


        testList.insert(1);
        testList.insert(20);
        testList.insert(300);

        assertFalse( testList.includes(12));
        assertFalse( testList.includes(202));
        assertFalse( testList.includes(3003));
    }

    @Test
    public void includes3() {


        testList.insert(1);
        testList.insert(20);
        testList.insert(-10);

        assertTrue( testList.includes(1));
        assertTrue( testList.includes(20));
        assertTrue( testList.includes(-10));
    }


    @Test
    public void testAppend1(){
        testList.insert(1);
        testList.insert(3);
        testList.insert(4);
        testList.append(2);

        assertEquals("value should be 2", 2, testList.head.next.next.next.data);


    }

    @Test
    public void testAppend2(){
        testList.insert(-1);
        testList.insert(-13);
        testList.insert(-4);
        testList.append(2);

        assertEquals("value should be 2", 2, testList.head.next.next.next.data);


    }

    @Test
    public void testAppend3(){

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));

        testList.print();
        String actualOutput = outString.toString();

        testList.append(2);

        assertTrue(actualOutput.isEmpty());

    }


}