package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchBinaryTreeTest {

    private BinarySearchBinaryTree testTree(){
        BinarySearchBinaryTree bt = new BinarySearchBinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;

    }

    @Test
    public void testAdd(){
        BinarySearchBinaryTree bt = testTree();
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(3));
        assertTrue(bt.containsNode(9));

        assertFalse(bt.containsNode(1));
        assertFalse(bt.containsNode(2));
        assertFalse(bt.containsNode(0));


    }

    @Test
    public void testSearch(){
        BinarySearchBinaryTree bt = testTree();

        assertEquals(6,bt.search(6).value);
        assertEquals(3,bt.search(3).value);
        assertEquals(9,bt.search(9).value);

        assertEquals(null, bt.search(2));


    }

}