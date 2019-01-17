package Hashtable.RepeatedWord;

import org.junit.Test;

import static Hashtable.RepeatedWord.RepeatedWord.getRepeatedWords;
import static org.junit.Assert.*;

public class RepeatedWordTest {


    @Test
    public void getRepeatedWordTest(){
        String testInput = "Once upon a time, there was a brave princess who...";
        String testInput2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String testInput3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
//        String outputResult = getRepeatedWords(testInput);
//        String outputResult2 = getRepeatedWords(testInput2);

//        String actual1 = "a";
//        String actual2 = "was";



//        assertEquals("a", outputResult);
//        assertEquals("it", outputResult2);
        assertEquals("summer", getRepeatedWords(testInput3));

//
//        assertTrue(getRepeatedWords(testInput3) == "summer");

    }
}