package Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {



    @Test
    public void preOrderTest() {
        BinaryTree testBinaryTree = new BinaryTree();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(9);


        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(6);
        expected.add(4);
        expected.add(3);
        expected.add(5);
        expected.add(8);
        expected.add(7);
        expected.add(9);

        assertEquals("Expected: [6, 4, 3, 5, 8, 7, 9]" ,expected, testBinaryTree.preOrder());



    }

    @Test
    public void postOrderTest() {
        BinaryTree testBinaryTree = new BinaryTree();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(9);


        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(3);
        expected.add(5);
        expected.add(4);
        expected.add(7);
        expected.add(9);
        expected.add(8);
        expected.add(6);

        assertEquals("Expected: [3, 5, 4, 7, 9, 8, 6]" ,expected, testBinaryTree.postOrder());



    }

    @Test
    public void inOrderTest() {
        BinaryTree testBinaryTree = new BinaryTree();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(9);


        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);

        assertEquals("Expected: [3, 4, 5, 6, 7, 8, 9]" ,expected, testBinaryTree.inOrder());
        


    }
}