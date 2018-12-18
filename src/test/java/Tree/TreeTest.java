package Tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;
import static org.junit.Assert.*;

public class TreeTest {

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


    Tree testTree;
    Node root;



//    @After
//    public void restoreStreams() {
//        System.setOut(originalOut);
//        System.setErr(originalErr);
//    }



    @Test
    public void preOrderTest() {
        Tree testTree = new Tree();

        testTree.root = new Node(10, null, null);
        testTree.root.left = new Node(7, null, null);
        testTree.root.left.left = new Node(3, null, null);
        testTree.root.left.right = new Node(18, null, null);
        testTree.root.right = new Node(100, null, null);
        testTree.root.right.left = new Node (5, null, null);


   String results = testTree.preOrder().toString();
List<Integer> testList = new ArrayList<>();

        testList.add(10);
        testList.add(7);
        testList.add(3);
        testList.add(18);
        testList.add(100);
        testList.add(5);



        assertEquals("Should be [10, 7, 3, 18, 100, 5]", testList, testTree.preOrder());






    }


    @Test
    public void inOrder() {
    }

    @Test
    public void postOrder() {
    }
}