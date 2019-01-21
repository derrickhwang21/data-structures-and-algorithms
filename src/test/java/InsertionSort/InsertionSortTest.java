package InsertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionNoneOutOfOrder() {

        int[] testInputAllInOrder = {1, 2, 3, 4, 5, 6};
        int[] expectedResultAllInOrder = {1, 2, 3, 4, 5, 6};
        InsertionSort.insertionSort(testInputAllInOrder);

        assertArrayEquals("Should be the same", expectedResultAllInOrder, testInputAllInOrder);

    }

    @Test
    public void testInsertionSortOneOutOfOrder() {

        int[] testInputOneOutOfOrder = {1, 2, 3, 5, 4, 6};
        int[] expectedResultOfOneOutOfOrder = {1, 2, 3, 4, 5, 6};
       InsertionSort.insertionSort(testInputOneOutOfOrder);

        assertArrayEquals("Should be the same", expectedResultOfOneOutOfOrder, testInputOneOutOfOrder);

    }

    @Test
    public void testInsertionSortMultipleOutOfOrder() {

        int[] testInputMultipleOutOfOrder = {2, 1, 3, 5, 6, 4};
        int[] expectedResultOfMultipleOutOfOrder = {1, 2, 3, 4, 5, 6};
        InsertionSort.insertionSort(testInputMultipleOutOfOrder);

        assertArrayEquals("Should be the same", expectedResultOfMultipleOutOfOrder, testInputMultipleOutOfOrder);

    }

    @Test
    public void testInsertionSortMultipleOutOfOrderWithNegativeIntegers() {

        int[] testInputMultipleOutOfOrderWithNegativeIntegers = {-2, 1, -3, -5, 6, 4};
        int[] expectedResultOfMultipleOutOfOrderWithNegativeIntegers = {-5, -3, -2, 1, 4, 6};
        InsertionSort.insertionSort(testInputMultipleOutOfOrderWithNegativeIntegers);

        assertArrayEquals("Should be the same", expectedResultOfMultipleOutOfOrderWithNegativeIntegers, testInputMultipleOutOfOrderWithNegativeIntegers);

    }

    @Test
    public void testInsertionSortEmptyArray() {

        int[] testInputEmptyArray = {};
        int[] expectedResultOfEmptyArray = {};
        InsertionSort.insertionSort(testInputEmptyArray);

        assertArrayEquals("Should be the same", expectedResultOfEmptyArray, testInputEmptyArray);

    }

    @Test
    public void testInsertionSortArrayWithOneIdenticalIndexValue() {

        int[] testInputOneIdenticalIndexValue = {3, 2, 1, 3, 4, 6};
        int[] expectedResultOfIdenticalIndexValue = {1, 2, 3, 3, 4, 6};
        InsertionSort.insertionSort(testInputOneIdenticalIndexValue);

        assertArrayEquals("Should be the same", expectedResultOfIdenticalIndexValue, testInputOneIdenticalIndexValue);

    }

    @Test
    public void testInsertionSortModuloArray() {

        int[] testInputOneNonMatchingIndexValue = {3, 2, 2, 2, 2, 2};
        int[] expectedResultOfOneNonMatchingIndexValue = {2, 2, 2, 2, 2, 3};
        InsertionSort.insertionSort(testInputOneNonMatchingIndexValue);

        assertArrayEquals("Should be the same", expectedResultOfOneNonMatchingIndexValue, testInputOneNonMatchingIndexValue);

    }

    @Test
    public void testInsertionPiArray() {

        int[] testInputPiArray = {1, 22/7, 2, 22/7, 3, 4};
        int[] expectedResultPiArray = {1, 2, 3, 22/7, 22/7, 4};
        InsertionSort.insertionSort(testInputPiArray);

        assertArrayEquals("Should be the same", expectedResultPiArray, testInputPiArray);

    }


}