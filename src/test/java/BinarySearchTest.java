import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch() {

        int[] testArray1 = {4,8,15,16,23,42};
        int testKey1 = 15;
        int expectedOutPutTest1 = 2;

        assertEquals("binarySearch should return 2", expectedOutPutTest1, BinarySearch.binarySearch(testKey1, testArray1));
    }
    @Test public void testBinarySearch2() {

        int[] testArray2 = {11,22,33,44,55,66,77};
        int testKey2 = 90;
        int expectedOutPutTest2 = -1;


        assertEquals("binarySearch should return -1", expectedOutPutTest2, BinarySearch.binarySearch(testKey2, testArray2));
    }
    @Test public void testBinarySearch3() {

        int[] testArray3 = {};
        int testKey3 = 90;
        int expectedOutPutTest3 = -1;

        assertEquals("binarySearch should return -1", expectedOutPutTest3, BinarySearch.binarySearch(testKey3, testArray3));
    }
}