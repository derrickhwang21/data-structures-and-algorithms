package Hashtable.LeftJoin;

import org.junit.Test;

import java.util.HashMap;

import static Hashtable.LeftJoin.LeftJoin.leftJoin;
import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void leftJoinTestWithMatchingKeys() {

        HashMap<String, String> synonyms = new HashMap<String, String>();
        HashMap<String, String> antonyms = new HashMap<String, String>();

        synonyms.put("fond", "enamored");
        synonyms.put("wrath", "anger");
        synonyms.put("diligent", "employed");
        antonyms.put("fond", "averse");
        antonyms.put("wrath", "delight");
        antonyms.put("diligent", "idle");

        String[][] results = leftJoin(synonyms, antonyms);
        String[][] expected = new String[][]{{"fond", "enamored", "averse"}, {"wrath", "anger", "delight"}, {"diligent", "employed", "idle"}};

        assertArrayEquals("must be the same", expected, results);


    }

    @Test
    public void leftJoinTestWithSomeMismatchingKeys() {

        HashMap<String, String> synonyms = new HashMap<String, String>();
        HashMap<String, String> antonyms = new HashMap<String, String>();

        synonyms.put("fond", "enamored");
        synonyms.put("wrath", "anger");
        synonyms.put("diligent", "employed");
        antonyms.put("fond", "averse");
        antonyms.put("blueberries", "delight");
        antonyms.put("diligent", "idle");

        String[][] results = leftJoin(synonyms, antonyms);
        String[][] expected = new String[][]{{"fond", "enamored", "averse"}, {"wrath", "anger", null}, {"diligent", "employed", "idle"}};

        assertArrayEquals("must be the same", expected, results);


    }

    @Test
    public void leftJoinTestWithNonMatchingKeys() {

        HashMap<String, String> synonyms = new HashMap<String, String>();
        HashMap<String, String> antonyms = new HashMap<String, String>();

        synonyms.put("fond", "enamored");
        synonyms.put("wrath", "anger");
        synonyms.put("diligent", "employed");
        antonyms.put("fondue", "averse");
        antonyms.put("wrathful", "delight");
        antonyms.put("diligently", "idle");

        String[][] results = leftJoin(synonyms, antonyms);
        String[][] expected = new String[][]{{"fond", "enamored", null}, {"wrath", "anger", null}, {"diligent", "employed", null}};

        assertArrayEquals("must be the same", expected, results);

    }

    @Test
    public void leftJoinTestWithNoValueKeys() {

        HashMap<String, String> synonyms = new HashMap<String, String>();
        HashMap<String, String> antonyms = new HashMap<String, String>();

        synonyms.put("fond", "");
        synonyms.put("wrath", "");
        synonyms.put("diligent", "employed");
        antonyms.put("fondue", "averse");
        antonyms.put("wrathful", "");
        antonyms.put("diligently", "");

        String[][] results = leftJoin(synonyms, antonyms);
        String[][] expected = new String[][]{{"fond", "", null}, {"wrath", "", null}, {"diligent", "employed", null}};

        assertArrayEquals("must be the same", expected, results);

    }

    @Test
    public void leftJoinTestWithNokeys() {

        HashMap<String, String> synonyms = new HashMap<String, String>();
        HashMap<String, String> antonyms = new HashMap<String, String>();

        synonyms.put("", "enamored");
        synonyms.put("", "anger");
        synonyms.put("", "employed");
        antonyms.put("", "averse");
        antonyms.put("", "delight");
        antonyms.put("", "idle");

        String[][] results = leftJoin(synonyms, antonyms);
        String[][] expected = new String[][]{{"", "employed", "idle"}};

        assertArrayEquals("must be the same", expected, results);

    }



}