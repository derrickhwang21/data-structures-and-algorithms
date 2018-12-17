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
        
    }

}