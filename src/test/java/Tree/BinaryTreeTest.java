package Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

//    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
//    private final PrintStream originalOut = System.out;
//    private final PrintStream originalErr = System.err;
//
//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(outContent));
//        System.setErr(new PrintStream(errContent));
//    }
//


    BinaryTree testBinaryTree;
    Node root;



//    @After
//    public void restoreStreams() {
//        System.setOut(originalOut);
//        System.setErr(originalErr);
//    }



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

        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);

        System.out.println(expected);
        System.out.println(testBinaryTree.preOrder());




    }


    @Test
    public void inOrder() {
    }

    @Test
    public void postOrder() {
    }
}