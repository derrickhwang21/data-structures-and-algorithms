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

    @Test
    public void testInsertBefore(){

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));



        testList.insert(1);
        testList.insert(3);
        testList.insert(4);
        testList.insertBefore(3, 4);

        testList.print();
        String actualOutput = outString.toString();

        assertEquals("value should be the same", "4 3 4 1 ", actualOutput);
    }

    @Test
    public void testInsertBefore2(){

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));



        testList.insert(1);
        testList.insert(3);
        testList.insert(4);
        testList.insertBefore(7, 4);

        testList.print();
        String actualOutput = outString.toString();

        assertEquals("value should be the same", "4 3 1 ", actualOutput);
    }

    @Test
    public void testInsertBefore3(){

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));




        testList.insertBefore(3, 4);

        testList.print();
        String actualOutput = outString.toString();

        assertTrue(actualOutput.isEmpty());
    }

    @Test
    public void testInsertAfter(){

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));



        testList.insert(1);
        testList.insert(3);
        testList.insert(4);
        testList.insertAfter(3, 4);

        testList.print();
        String actualOutput = outString.toString();

        assertEquals("value should be the same", "4 4 3 1 ", actualOutput);
    }

    @Test
    public void testInsertAfter2(){

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));



        testList.insert(1);
        testList.insert(3);
        testList.insert(4);
        testList.insertAfter(35, 4);

        testList.print();
        String actualOutput = outString.toString();

        assertEquals("value should be the same", "4 3 1 ", actualOutput);
    }


    @Test
    public void testInsertAfter3(){

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));




        testList.insertAfter(3, 4);

        testList.print();
        String actualOutput = outString.toString();

        assertTrue(actualOutput.isEmpty());
    }

    @Test
    public void testkthFromEnd(){

        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insert(6);
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        int result = testList.kthFromEnd(4);

        assertEquals(5, result);
    }

    @Test
    public void testkthFromEnd2(){

        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insert(6);
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        int result = testList.kthFromEnd(0);
        System.out.print(result);
        assertEquals(9, result);

    }


    @Test
    public void testkthFromEnd3(){

        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insert(6);
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        int result = testList.kthFromEnd(2);

        assertEquals(7, result);
    }

    @Test
    public void testMerge() {

        LinkedList testList1 = new LinkedList();
        testList1.insert(1);
        testList1.insert(3);
        testList1.insert(2);

        LinkedList testList2 = new LinkedList();
        testList2.insert(5);
        testList2.insert(9);
        testList2.insert(4);


        System.out.println(LinkedList.merge(testList1, testList2));
    }
}


