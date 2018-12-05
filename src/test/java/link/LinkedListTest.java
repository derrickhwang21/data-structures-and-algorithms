package link;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.Assert.*;



public class LinkedListTest {

    @Test
    public void printTest(){
        LinkedList testList = new LinkedList();

        testList.insert(1);

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));

        testList.print();
        String actualOutput = outString.toString();

        assertEquals("1 ", actualOutput);

    }

    @Test
    public void printTest2(){

        LinkedList testList2 = new LinkedList();

        testList2.insert(1);
        testList2.insert(2);
        testList2.insert(3);
        testList2.insert(4);

        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));

        testList2.print();
        String actualOutput = outString.toString();


        assertEquals("4 3 2 1 ", actualOutput);

    }

    @Test
    public void printTest3(){

        LinkedList testList3 = new LinkedList();


        OutputStream outString = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outString));

        testList3.print();
        String actualOutput = outString.toString();

        assertTrue(actualOutput.isEmpty());


    }




    @Test
    public void testInsert() {
        LinkedList testListInsert = new LinkedList();
        testListInsert.insert(1);


        assertEquals("output should equal to 1", 1, testListInsert.head.data);
    }

    @Test
    public void testInsert2() {
        LinkedList testLList = new LinkedList();
        testLList.insert(4);
        testLList.insert(2);


        ArrayList<Integer> testAList = new ArrayList<>();
        testAList.add(2);
        testAList.add(4);

        assertEquals("output should equal to 1", testAList , testLList.toIntegerArray());

    }

    @Test
    public void testInsert3() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);




        assertEquals("output should equal to 1", 1, testList.head.next.next.data);
    }


    @Test
    public void includes1() {
        LinkedList testList = new LinkedList();

        testList.insert(1);
        testList.insert(20);
        testList.insert(300);

        assertTrue( testList.includes(1));
        assertTrue( testList.includes(20));
        assertTrue( testList.includes(300));
    }

    @Test
    public void includes2() {
        LinkedList testList = new LinkedList();

        testList.insert(1);
        testList.insert(20);
        testList.insert(300);

        assertFalse( testList.includes(12));
        assertFalse( testList.includes(202));
        assertFalse( testList.includes(3003));
    }

    @Test
    public void includes3() {
        LinkedList testList = new LinkedList();

        testList.insert(1);
        testList.insert(20);
        testList.insert(-10);

        assertTrue( testList.includes(1));
        assertTrue( testList.includes(20));
        assertTrue( testList.includes(-10));
    }




}