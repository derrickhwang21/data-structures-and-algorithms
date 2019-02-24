import org.junit.Test;
import java.util.Arrays;
import static junit.framework.TestCase.assertEquals;

public class ArrayReverseTest {

    @Test
    public void testReverseArrayLength() {
        int[] arrayToTest = {1,2,3,4};
        int[] arrayToTestNoInteger = {};
        int[] arrayToTestMixed = {-1,0,3,3,4};
        int[] arrayToTestLong = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

        int resultOfArrayToTest = ArrayReverse.reverseArray(arrayToTest).length;
        int resultOfArrayNoIntegers = ArrayReverse.reverseArray(arrayToTestNoInteger).length;
        int resultOfArrayMixed = ArrayReverse.reverseArray(arrayToTestMixed).length;
        int resultOfArrayLong = ArrayReverse.reverseArray(arrayToTestLong).length;

        assertEquals("returned length should be the same", arrayToTest.length, resultOfArrayToTest);
        assertEquals("returned length should be the same", arrayToTestNoInteger.length, resultOfArrayNoIntegers);
        assertEquals("returned length should be the same", arrayToTestMixed.length, resultOfArrayMixed);
        assertEquals("returned length should be the same", arrayToTestLong.length, resultOfArrayLong);
    }

    @Test
    public void testReverseArrayResult() {
        int[] arrayToTest = {1,2,3,4};
        int[] arrayToTestNoInteger = {};
        int[] arrayToTestMixed = {-1,0,3,3,4};
        int[] arrayToTestLong = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

        int[] resultOfArrayToTest = ArrayReverse.reverseArray(arrayToTest);
        int[] resultOfArrayNoIntegers = ArrayReverse.reverseArray(arrayToTestNoInteger);
        int[] resultOfArrayMixed = ArrayReverse.reverseArray(arrayToTestMixed);
        int[] resultOfArrayLong = ArrayReverse.reverseArray(arrayToTestLong);

        int[] expectedArrayFromTest = {4,3,2,1};
        int[] expectedArrayFromNoInteger = {};
        int[] expectedArrayFromMixed = {4,3,3,0,-1};
        int[] expectedArrayFromLong = {199, 197, 193, 191, 181, 179, 173, 167, 163, 157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2};




        assertEquals("returned array should be the same",Arrays.toString(expectedArrayFromTest), Arrays.toString(resultOfArrayToTest));
        assertEquals("returned array should be the same", Arrays.toString(expectedArrayFromNoInteger), Arrays.toString(resultOfArrayNoIntegers));
        assertEquals("returned array should be the same", Arrays.toString(expectedArrayFromMixed), Arrays.toString(resultOfArrayMixed));
        assertEquals("returned array should be the same", Arrays.toString(expectedArrayFromLong), Arrays.toString(resultOfArrayLong));
    }



}