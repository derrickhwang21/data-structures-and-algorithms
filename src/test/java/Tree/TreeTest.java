package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    private BinarySearchTree testTree(){
        BinarySearchTree bt = new BinarySearchTree();

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
        BinarySearchTree bt = testTree();
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(3));
        assertTrue(bt.containsNode(9));

        assertFalse(bt.containsNode(1));
        assertFalse(bt.containsNode(2));
        assertFalse(bt.containsNode(0));
    }

    @Test
    public void testPreorder(){
        BinarySearchTree bt = testTree();


    }

}