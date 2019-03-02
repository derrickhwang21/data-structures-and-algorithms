package chapterOneCCI;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationTest {

    @Test
    public void isStringPermutationTrue() {

        String testStringOne = "dad";
        String testStringTwo = "add";


        assertTrue(StringPermutation.isStringPermutation(testStringOne, testStringTwo));
    }
}