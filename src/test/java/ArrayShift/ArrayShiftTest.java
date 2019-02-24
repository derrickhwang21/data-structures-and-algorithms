package ArrayShift;

import org.junit.Test;

import java.util.Arrays;

import static ArrayShift.ArrayShift.insertShiftArray;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class ArrayShiftTest {
    @Test
    public void testOutputArrayLength() {
        int[] arrayToTestEven = {1,2,3,4};
        int[] arrayToTestOdd = {1,3,3,4,4};
        int[] arrayToTestNoElement = {};

        assertEquals("returned array should be one longer", arrayToTestEven.length + 1, insertShiftArray(arrayToTestEven, 5).length);
        assertEquals("returned array should be one longer", arrayToTestOdd.length + 1, insertShiftArray(arrayToTestOdd, 5).length);
        assertEquals("returned array should be one longer", arrayToTestNoElement.length + 1, insertShiftArray(arrayToTestNoElement, 5).length);
    }

    @Test
    public void testArrayShift() {
        int[] arrayToTestEven = {1,2,3,4};
        int[] arrayToTestOdd = {1,3,3,4,4};
        int[] arrayToTestNoElement = {};

        int[] evenArrayToCompare = {1,2,3,3,4};
        int[] oddArrayToCompare = {1,3,3,3,4,4};
        int[] noElementArrayToCompare = {3};

        int valueToInsert = 3;

        assertArrayEquals("3 should be added to the center of the array", evenArrayToCompare, insertShiftArray(arrayToTestEven, valueToInsert));
        assertArrayEquals("3 should be added to the center of the array", oddArrayToCompare, insertShiftArray(arrayToTestOdd, valueToInsert));
        assertArrayEquals("3 should be added to the center of the array", noElementArrayToCompare, insertShiftArray(arrayToTestNoElement, valueToInsert));
    }

    @Test
    public void testRemoveShiftArray() {
        int[] arrayToTestEven = {1,2,3,4};
        int[] arrayToTestOdd = {1,3,3,4,4};
        int[] arrayToTestNoElement = {};
        int[] arrayToTestOneElement = {1};
        int[] arrayToTestTwoElements = {1,2};

        int[] evenArrayToCompare = {1,2,4};
        int[] oddArrayToCompare = {1,3,3,4};
        int[] noElementArrayToCompare = {};
        int[] oneElementArrayToCompare = {1};
        int[] twoElementsArrayToCompare = {1};

        assertArrayEquals("Arrays should be the same", evenArrayToCompare, ArrayShift.removeShiftArray(arrayToTestEven));
        assertArrayEquals("Arrays should be the same", oddArrayToCompare, ArrayShift.removeShiftArray(arrayToTestOdd));
        assertArrayEquals("Arrays should be the same", noElementArrayToCompare, ArrayShift.removeShiftArray(arrayToTestNoElement));
        assertArrayEquals("Arrays should be the same", oneElementArrayToCompare, ArrayShift.removeShiftArray(arrayToTestOneElement));
        assertArrayEquals("Arrays should be the same", twoElementsArrayToCompare, ArrayShift.removeShiftArray(arrayToTestTwoElements));

    }
}