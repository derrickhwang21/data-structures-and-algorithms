package TreeIntersection;

import Tree.BinaryTree;
import Tree.Node;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

import static TreeIntersection.TreeIntersection.treeIntersection;
import static org.junit.Assert.assertEquals;


public class TreeIntersectionTest {

    @Test
    public void treeIntersectionTest() {
        BinaryTree testBinaryTree = new BinaryTree();
        BinaryTree testBinaryTree2 = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);


        testBinaryTree2.root = new Node(6);
        testBinaryTree2.root.left = new Node(2);
        testBinaryTree2.root.left.right = new Node(2);
        testBinaryTree2.root.right = new Node(8);
        testBinaryTree2.root.right.left = new Node(1);


        expected.add(6);
        expected.add(8);

        ArrayList result = treeIntersection(testBinaryTree, testBinaryTree2);

        assertEquals("Expected: [6, 8]" ,expected, result);
    }

    @Test
    public void treeIntersectionTest2() {
        BinaryTree testBinaryTree = new BinaryTree();
        BinaryTree testBinaryTree2 = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);
        testBinaryTree.root.left.right = new Node(5);
        testBinaryTree.root.right = new Node(8);
        testBinaryTree.root.right.left = new Node(7);
        testBinaryTree.root.right.right = new Node(9);


        testBinaryTree2.root = new Node(6);
        testBinaryTree2.root.left = new Node(2);
        testBinaryTree2.root.left.left = new Node(3);
        testBinaryTree2.root.left.right = new Node(2);
        testBinaryTree2.root.right = new Node(8);
        testBinaryTree2.root.right.left = new Node(1);
        testBinaryTree2.root.right.right = new Node(9);


        expected.add(3);
        expected.add(6);
        expected.add(8);
        expected.add(9);

        ArrayList result = treeIntersection(testBinaryTree, testBinaryTree2);

        assertEquals("Expected: [6, 4, 3, 5, 8, 7, 9]" ,expected,result);
    }

    @Test
    public void treeIntersectionTestAllLeft() {
        BinaryTree testBinaryTree = new BinaryTree();
        BinaryTree testBinaryTree2 = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.left = new Node(4);
        testBinaryTree.root.left.left = new Node(3);



        testBinaryTree2.root = new Node(10);
        testBinaryTree2.root.left = new Node(8);
        testBinaryTree2.root.left.left = new Node(3);



        expected.add(3);


        ArrayList result = treeIntersection(testBinaryTree, testBinaryTree2);

        assertEquals("Expected: [3]" ,expected,result);
    }

    @Test
    public void treeIntersectionTestAllRight() {
        BinaryTree testBinaryTree = new BinaryTree();
        BinaryTree testBinaryTree2 = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(6);
        testBinaryTree.root.right = new Node(10);
        testBinaryTree.root.right.right = new Node(12);
        testBinaryTree.root.right.right.right = new Node(13);
        testBinaryTree.root.right.right.right.right = new Node(15);



        testBinaryTree2.root = new Node(4);
        testBinaryTree2.root.right = new Node(10);
        testBinaryTree2.root.right.right = new Node(11);
        testBinaryTree2.root.right.right.right = new Node(13);
        testBinaryTree2.root.right.right.right.right = new Node(15);



        expected.add(10);
        expected.add(13);
        expected.add(15);


        ArrayList result = treeIntersection(testBinaryTree, testBinaryTree2);

        assertEquals("Expected: [10, 13, 15]" ,expected,result);
    }
}