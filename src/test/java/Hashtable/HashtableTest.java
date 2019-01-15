package Hashtable;

import org.junit.Test;

import static Hashtable.Hashtable.getRepeatedWords;
import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testTableLength() {
        Hashtable testTable = new Hashtable();
        testTable.add(1, 1);
        testTable.add(2, 2);


        assertTrue(testTable.getBuckets() == 16);
    }

    @Test
    public void addTest() {

        // Testing a no node table
        Hashtable testTableNoNode = new Hashtable();
        assertTrue(testTableNoNode.isEmpty());

        // Testing a sing node table
        Hashtable testTableSingleNode = new Hashtable();
        testTableSingleNode.add(1, 1);
        assertEquals("size should be 1", 1, testTableSingleNode.size());

        // Testing multiple nodes table
        Hashtable testTableMultipleNodes = new Hashtable();
        testTableMultipleNodes.add("key1", 10);
        testTableMultipleNodes.add("key2", "blueberries");
        testTableMultipleNodes.add("key3", 1);
        testTableMultipleNodes.add("key4", 1032);
        testTableMultipleNodes.add("key5", 1033);
        testTableMultipleNodes.add("key6", 10);
        assertEquals("Size should be 6", 6, testTableMultipleNodes.size());

        // Testing a resized nodes table
        Hashtable testResizedTableMultipleNodes = new Hashtable();
        int testNodes = 20;
        for (int i = 0; i < testNodes; i++){
            testResizedTableMultipleNodes.add(i, i);
        }
        assertEquals("size should be 20", testResizedTableMultipleNodes.size(), 20);
        assertEquals("length should be 32", testResizedTableMultipleNodes.getBuckets(), 32);

    }

    @Test
    public void findTest() {

        // Testing a sing node table
        Hashtable testTableSingleNode = new Hashtable();
        testTableSingleNode.add(1, 1);
        assertEquals("size should be 1", 1, testTableSingleNode.find(1));

        // Testing multiple nodes table
        Hashtable testTableMultipleNodes = new Hashtable();
        int testNodesCount = 9;
        String[] keyTestValues = {"key1", "key2", "key3", "key4", "key5", "key6", "key7", "key8", "key9"};
        int[] valueTestValues = new int[testNodesCount];
        for (int i = 0; i < testNodesCount; i++){
           valueTestValues[i] = i;
           testTableMultipleNodes.add(keyTestValues[i], valueTestValues[i]);
        }
        assertEquals("Size should be 9", 9, testTableMultipleNodes.size());
        for(int i = 0; i < testNodesCount; i++){
            assertEquals(testTableMultipleNodes.find(keyTestValues[i]),valueTestValues[i]);
        }

        // Testing a resized nodes table
        Hashtable testResizedTableMultipleNodes = new Hashtable();
        int testNodesResized = 20;
        int[] testResizedMultipleKeys = new int[testNodesResized];
        int[] testResizedMultipleValues = new int[testNodesResized];
        for (int i = 0; i < testNodesResized; i++){
            testResizedMultipleKeys[i] = i;
            testResizedMultipleValues[i] = i;
            testResizedTableMultipleNodes.add(testResizedMultipleKeys[i], testResizedMultipleValues[i]);
        }
        for(int i = 0; i < testNodesResized; i++){
            assertEquals(testResizedTableMultipleNodes.find(testResizedMultipleKeys[i]),testResizedMultipleValues[i]);
        }
    }

    @Test
    public void containsTest() {

        // Testing a sing node table
        Hashtable testTableSingleNode = new Hashtable();
        testTableSingleNode.add(1, 1);
        assertTrue(testTableSingleNode.contains(1));
        assertFalse(testTableSingleNode.contains(0));

        // Testing multiple nodes table
        Hashtable testTableMultipleNodes = new Hashtable();
        int testNodesCount = 9;
        String[] keyTestValues = {"key1", "key2", "key3", "key4", "key5", "key6", "key7", "key8", "key9"};
        int[] valueTestValues = new int[testNodesCount];
        for (int i = 0; i < testNodesCount; i++){
            valueTestValues[i] = i;
            testTableMultipleNodes.add(keyTestValues[i], valueTestValues[i]);
        }
        for(int i = 0; i < testNodesCount; i++){
           assertTrue(testTableMultipleNodes.contains(keyTestValues[i]));
        }

        // Testing a resized nodes table
        Hashtable testResizedTableMultipleNodes = new Hashtable();
        int testNodesResized = 20;
        int[] testResizedMultipleKeys = new int[testNodesResized];
        int[] testResizedMultipleValues = new int[testNodesResized];
        for (int i = 0; i < testNodesResized; i++){
            testResizedMultipleKeys[i] = i;
            testResizedMultipleValues[i] = i;
            testResizedTableMultipleNodes.add(testResizedMultipleKeys[i], testResizedMultipleValues[i]);
        }
        for(int i = 0; i < testNodesResized; i++){
            int falseValue = i * 30;
            assertTrue(testResizedTableMultipleNodes.contains(testResizedMultipleKeys[i]));
        }
    }

    @Test
    public void getHashTest() {

        // Testing a sing node table
        Hashtable testTableSingleNode = new Hashtable();
        testTableSingleNode.add(1, 1);
        assertEquals("size should be 1", 1, testTableSingleNode.getHash(1));

        // Testing multiple nodes table
        Hashtable testTableMultipleNodes = new Hashtable();
        Hashtable testTableMultipleNodesClone = new Hashtable();
        int testNodesCount = 9;
        String[] keyTestValues = {"key1", "key2", "key3", "key4", "key5", "key6", "key7", "key8", "key9"};
        String[] keyTestValuesClone = {"key1", "key2", "key3", "key4", "key5", "key6", "key7", "key8", "key9"};
        int[] valueTestValues = new int[testNodesCount];
        int[] valueTestValuesClone = new int[testNodesCount];
        for (int i = 0; i < testNodesCount; i++){
            valueTestValues[i] = i;
            valueTestValuesClone[i] = i;
            testTableMultipleNodes.add(keyTestValues[i], valueTestValues[i]);
            testTableMultipleNodesClone.add(keyTestValues[i], valueTestValues[i]);
        }
        for(int i = 0; i < testNodesCount; i++){
            assertEquals(testTableMultipleNodes.getHash(keyTestValues[i]), testTableMultipleNodesClone.getHash(keyTestValuesClone[i]));
        }

        // Testing a resized nodes table
        Hashtable testResizedTableMultipleNodes = new Hashtable();
        Hashtable testResizedTableMultipleNodesClone = new Hashtable();
        int testNodesResized = 20;
        int[] testResizedMultipleKeys = new int[testNodesResized];
        int[] testResizedMultipleValues = new int[testNodesResized];
        int[] testResizedMultipleKeysClone = new int[testNodesResized];
        int[] testResizedMultipleValuesClone = new int[testNodesResized];
        for (int i = 0; i < testNodesResized; i++){
            testResizedMultipleKeys[i] = i;
            testResizedMultipleValues[i] = i;
            testResizedMultipleKeysClone[i] = i;
            testResizedMultipleValuesClone[i] = i;
            testResizedTableMultipleNodes.add(testResizedMultipleKeys[i], testResizedMultipleValues[i]);
            testResizedTableMultipleNodesClone.add(testResizedMultipleKeysClone[i], testResizedMultipleValuesClone[i]);
        }
        for(int i = 0; i < testNodesResized; i++){
            assertEquals(testResizedTableMultipleNodes.getHash(testResizedMultipleKeys[i]),testResizedTableMultipleNodesClone.getHash(testResizedMultipleKeysClone[i]));
        }
    }


    @Test
    public void getRepeatedWordTest(){
        String testInput = "Once upon a time, there was a brave princess who...";
        String testInput2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String outputResult = getRepeatedWords(testInput2);

        System.out.println(outputResult);
    }
}