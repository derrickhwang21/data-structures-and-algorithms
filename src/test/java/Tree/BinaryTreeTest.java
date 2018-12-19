package Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {



    @Test
    public void preOrderTest() {


        /**
         * preOrderTest - testing ordered tree
         */
        BinaryTree testBinaryTree = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(9);

        expected.add(6);
        expected.add(4);
        expected.add(3);
        expected.add(5);
        expected.add(8);
        expected.add(7);
        expected.add(9);


        /**
         * preOrderTest - testing left tree
         */
        BinaryTree testLeftOnlyBinaryTree = new BinaryTree();
        ArrayList<Integer> expectedLeft = new ArrayList<>();

        testLeftOnlyBinaryTree.root = new Node(6);
        testLeftOnlyBinaryTree.root.left = new Node(4);
        testLeftOnlyBinaryTree.root.left.left = new Node(3);

        expectedLeft.add(6);
        expectedLeft.add(4);
        expectedLeft.add(3);

        /**
         * preOrderTest - testing right tree
         */
        BinaryTree testRightOnlyBinaryTree = new BinaryTree();
        ArrayList<Integer> expectedRight = new ArrayList<>();

        testRightOnlyBinaryTree.root = new Node(6);
        testRightOnlyBinaryTree.root.right = new Node(8);
        testRightOnlyBinaryTree.root.right.right = new Node(9);

        expectedRight.add(6);
        expectedRight.add(8);
        expectedRight.add(9);

        /**
         * preOrderTest - testing empty tree
         */
        BinaryTree testBinaryTreeEmpty = new BinaryTree();
        ArrayList<Integer> expectedEmpty = new ArrayList<>();


        assertEquals("Expected: [6, 4, 3, 5, 8, 7, 9]" ,expected, testBinaryTree.preOrder());
        assertEquals("Expected: [6, 4, 3]" ,expectedLeft, testLeftOnlyBinaryTree.preOrder());
        assertEquals("Expected: [6, 8, 9]" ,expectedRight, testRightOnlyBinaryTree.preOrder());
        assertEquals("Expected: []" ,expectedEmpty, testBinaryTreeEmpty.preOrder());



    }


    @Test
    public void postOrderTest() {

        /**
         * postOrderTest - testing ordered tree
         */
        BinaryTree testBinaryTree = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(9);

        expected.add(3);
        expected.add(5);
        expected.add(4);
        expected.add(7);
        expected.add(9);
        expected.add(8);
        expected.add(6);

        /**
         * postOrderTest - testing left tree
         */
        BinaryTree testLeftOnlyBinaryTree = new BinaryTree();
        ArrayList<Integer> expectedLeft = new ArrayList<>();

        testLeftOnlyBinaryTree.root = new Node(6);
        testLeftOnlyBinaryTree.root.left = new Node(4);
        testLeftOnlyBinaryTree.root.left.left = new Node(3);

        expectedLeft.add(3);
        expectedLeft.add(4);
        expectedLeft.add(6);

        /**
         * postOrderTest - testing right tree
         */
        BinaryTree testRightOnlyBinaryTree = new BinaryTree();
        ArrayList<Integer> expectedRight = new ArrayList<>();

        testRightOnlyBinaryTree.root = new Node(6);
        testRightOnlyBinaryTree.root.right = new Node(8);
        testRightOnlyBinaryTree.root.right.right = new Node(9);

        expectedRight.add(9);
        expectedRight.add(8);
        expectedRight.add(6);

        /**
         * postOrderTest - testing empty tree
         */
        BinaryTree testBinaryTreeEmpty = new BinaryTree();
        ArrayList<Integer> expectedEmpty = new ArrayList<>();

        assertEquals("Expected: [3, 5, 4, 7, 9, 8, 6]" ,expected, testBinaryTree.postOrder());
        assertEquals("Expected: [3, 4, 6]" ,expectedLeft, testLeftOnlyBinaryTree.postOrder());
        assertEquals("Expected: [9, 8, 6]" ,expectedRight, testRightOnlyBinaryTree.postOrder());
        assertEquals("Expected: []" ,expectedEmpty, testBinaryTreeEmpty.postOrder());



    }

    @Test
    public void inOrderTest() {

        /**
         * inOrderTest - testing ordered tree
         */
        BinaryTree testBinaryTree = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(9);

        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);

        /**
         * inOrderTest - testing left tree
         */
        BinaryTree testLeftOnlyBinaryTree = new BinaryTree();
        ArrayList<Integer> expectedLeft = new ArrayList<>();

        testLeftOnlyBinaryTree.root = new Node(6);
        testLeftOnlyBinaryTree.root.left = new Node(4);
        testLeftOnlyBinaryTree.root.left.left = new Node(3);

        expectedLeft.add(3);
        expectedLeft.add(4);
        expectedLeft.add(6);

        /**
         * inOrderTest - testing right tree
         */
        BinaryTree testRightOnlyBinaryTree = new BinaryTree();
        ArrayList<Integer> expectedRight = new ArrayList<>();

        testRightOnlyBinaryTree.root = new Node(6);
        testRightOnlyBinaryTree.root.right = new Node(8);
        testRightOnlyBinaryTree.root.right.right = new Node(9);

        expectedRight.add(6);
        expectedRight.add(8);
        expectedRight.add(9);

        /**
         * inOrderTest - testing empty tree
         */
        BinaryTree testBinaryTreeEmpty = new BinaryTree();
        ArrayList<Integer> expectedEmpty = new ArrayList<>();

        assertEquals("Expected: [3, 4, 5, 6, 7, 8, 9]" ,expected, testBinaryTree.inOrder());
        assertEquals("Expected: [3, 4, 6]" ,expectedLeft, testLeftOnlyBinaryTree.inOrder());
        assertEquals("Expected: [6, 8, 9]" ,expectedRight, testRightOnlyBinaryTree.inOrder());
        assertEquals("Expected: []" ,expectedEmpty, testBinaryTreeEmpty.inOrder());



    }
}