package fizzbuzztree;

import Tree.BinaryTree;
import Tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class fizzBuzzTreeTest {

    @Test
    public void fizzBuzzTree() {
        /**
         * inOrderTest - testing ordered tree
         */
        BinaryTree testBinaryTree = new BinaryTree();
        ArrayList<String> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(15);

        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("6");
        expected.add("7");
        expected.add("8");
        expected.add("FizzBuzz");

        /**
         * inOrderTest - testing left tree
         */
        BinaryTree testLeftOnlyBinaryTree = new BinaryTree();
        ArrayList<String> expectedLeft = new ArrayList<>();

        testLeftOnlyBinaryTree.root = new Node(15);
        testLeftOnlyBinaryTree.root.left = new Node(5);
        testLeftOnlyBinaryTree.root.left.left = new Node(3);

        expectedLeft.add("Fizz");
        expectedLeft.add("Buzz");
        expectedLeft.add("FizzBuzz");

        /**
         * inOrderTest - testing right tree
         */
        BinaryTree testRightOnlyBinaryTree = new BinaryTree();
        ArrayList<String> expectedRight = new ArrayList<>();

        testRightOnlyBinaryTree.root = new Node(3);
        testRightOnlyBinaryTree.root.right = new Node(5);
        testRightOnlyBinaryTree.root.right.right = new Node(30);

        expectedRight.add("Fizz");
        expectedRight.add("Buzz");
        expectedRight.add("FizzBuzz");

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