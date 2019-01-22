package InsertionSort.MergeSort;

import org.junit.Test;

import static InsertionSort.MergeSort.MergeSort.mergeSort;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortEvenArrayTest() {
        int[] mergeSortTestArray = { 5, 1, 6, 2, 3, 4 };
        int[] mergeSortExpectedResultArray = { 1, 2, 3, 4, 5, 6 };

        int[] mergeSortResultArray = mergeSort(mergeSortTestArray);
        int lengthOfEvenArrayResult = mergeSortResultArray.length;

        assertEquals("Length of Array needs to be 6", 6, lengthOfEvenArrayResult);
        assertArrayEquals("Array needs to be the same", mergeSortExpectedResultArray, mergeSortResultArray);

    }

    @Test
    public void mergeSortOddLengthArrayTest() {
        int[] mergeSortTestOddLengthArray = { 5, 1, 6, 2, 3};
        int[] mergeSortExpectedResultOddLengthArray = { 1, 2, 3, 5, 6 };

        int[] mergeSortResultOddLengthArray = mergeSort(mergeSortTestOddLengthArray);
        int lengthOfOddArrayResult = mergeSortResultOddLengthArray.length;

        assertEquals("Length of Array needs to be 5", 5, lengthOfOddArrayResult);
        assertArrayEquals("Array needs to be the same", mergeSortExpectedResultOddLengthArray, mergeSortResultOddLengthArray);

    }

    @Test
    public void mergeSortNoValueArray() {
        int[] mergeSortNoValueTestArray = {};
        int[] mergeSortExpectedNoValueArray = {};

        int[] mergeSortResultNoValueArray = mergeSort(mergeSortNoValueTestArray);
        int lengthOfNoValueSortedArray = mergeSortResultNoValueArray.length;

        assertEquals("Length of Array needs to be 0", 0, lengthOfNoValueSortedArray);
        assertArrayEquals("Array needs to be the same", mergeSortExpectedNoValueArray, mergeSortResultNoValueArray);

    }



}