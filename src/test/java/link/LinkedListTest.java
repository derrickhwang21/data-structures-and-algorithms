package link;

import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;



public class LinkedListTest {


    @Test
    public void testInsert() {
        LinkedList testList = new LinkedList();
        testList.insert(1);


        assertEquals("output should equal to 1", 1, testList.head.data);
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
    public void testPrint(){
        LinkedList testList = new LinkedList();
        LinkedList testList2 = new LinkedList();
        LinkedList testList3 = new LinkedList();
        testList.insert(1);
        testList.insert(20);
        testList.insert(300);

        }

        assertThat(testList2.);



    }

}