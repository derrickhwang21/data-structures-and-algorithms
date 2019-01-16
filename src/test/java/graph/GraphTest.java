package graph;

import org.junit.After;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    //Credit: Michelle Ferreirae from lecture Day 26 part 1
    @Test
    public void testGraphConstructor(){
        Graph<String> g = new Graph<>();
        assertEquals(0, g.nodes.size(),"The new graph should have no nodes");
    }

    //Credit: Michelle Ferreirae from lecture Day 26 part 1
    @Test
    public void testAddNode() {
        Graph<String> g = new Graph<>();
        Node<String> nodeOne = g.addNode("A");
        assertEquals( "A", nodeOne.data, "value in node should match passed in value");
        assertEquals(1, g.nodes.size(),"One node adds to graph");
        assertEquals(nodeOne, g.nodes.iterator().next(),"node returned is same as node in graph");

        Node<String> nodeTwo = g.addNode("B");
        assertEquals("B", nodeTwo.data,"value in node should match passed in value");
        assertEquals(2, g.nodes.size(),"One node adds to graph");

        Node<String> nodeThree = g.addNode("C");
        assertEquals("C", nodeThree.data,"value in node should match passed in value");
        assertEquals(3, g.nodes.size(),"One node adds to graph");

        g.addNode("A");
        assertEquals(4, g.nodes.size(),"should allow two nodes with same value");
    }

    //Credit: Michelle Ferreirae from lecture Day 26 part 1
    @Test
    public void addEdge() {
        Graph<String> g = new Graph<>();
        Node<String> node1 = g.addNode("A");
        Node<String> node2 = g.addNode("B");
        g.addEdge(1, node1, node2);

        System.out.println(node1.neighbors);
        assertEquals(1, node1.neighbors.size(),"node 1 should have one neighbor");
        assertEquals(node2, node1.neighbors.iterator().next().node,"That neighbor should be node 2");
        assertEquals(1,node1.neighbors.iterator().next().weight,"weight should be 1");

        assertEquals(1, node2.neighbors.size(),"node 2 should have one neighbor");
        assertEquals(node1, node2.neighbors.iterator().next().node,"That neighbor should be node 2");
        assertEquals(1,node2.neighbors.iterator().next().weight,"weight should be 1");
    }

    /**
     * Test Graph: getNodes Method
     */
    @Test
    public void getNodes() {
        Graph<String> g = new Graph();

        Node node1 = g.addNode("A");
        Node node2 = g.addNode("B");
        Node node3 = g.addNode("C");

        Set<Node<String>> vertices = g.getNodes();
        assertEquals(3, vertices.size());
        assertTrue(vertices.contains(node1));
        assertTrue(vertices.contains(node2));
        assertTrue(vertices.contains(node3));
    }

    /**
     * Test Graph: getNeighbors Method
     */
    @Test
    public void getNeighbors() {
        Graph<String> g = new Graph();

        Node node1 = g.addNode("A");
        Node node2 = g.addNode("B");
        Node node3 = g.addNode("C");
        Node node4 = g.addNode("D");

        g.addEdge(1, node1, node2);
        g.addEdge(2, node2, node3);
        g.addEdge(3, node3, node1);

       Set neighborNode1 = g.getNeighbors(node1);
        assertTrue(neighborNode1.size() == 2);

        Set neighborNode2 = g.getNeighbors(node2);
        assertTrue(neighborNode2.size() == 2);

        Set neighborNode3 = g.getNeighbors(node3);
        assertTrue(neighborNode3.size() == 2);

        Set neighborNode4 = g.getNeighbors(node4);
        assertTrue(neighborNode4.size() == 0);
    }

    /**
     * Test Graph: size Method
     */
    @Test
    public void testSize() {
        Graph g = new Graph();
        assertEquals(0, g.size());

        g.addNode("A");
        assertEquals(1, g.size());

        g.addNode("B");
        assertEquals(2, g.size());
    }

    /**
     * Test Graph: Bread-First Search Method
     *
     * Testing Instruction: If running the entire test file, be sure to include @After annotation. If running only `testBFS()` please remove @After annotation to allow it to run properly individually. 
     *
     */
    @Test
    @After
    public void testBFS() {
        Graph<String> graphBFS = new Graph<>();

        Node<String> P = graphBFS.addNode("P");
        Node<String> A = graphBFS.addNode("A");
        Node<String> C = graphBFS.addNode("C");
        Node<String> G = graphBFS.addNode("G");
        Node<String> X = graphBFS.addNode("X");
        Node<String> T = graphBFS.addNode("T");

        graphBFS.addEdge(1, P, A);
        graphBFS.addEdge(1, A, C);
        graphBFS.addEdge(1, A, G);
        graphBFS.addEdge(1, C, G);
        graphBFS.addEdge(1, C, X);
        graphBFS.addEdge(1, C, T);
        graphBFS.addEdge(1, T, G);

        Iterable<Node> result = (Iterable<Node>) graphBFS.bfs(P);
        Iterator<Node> i = result.iterator();

        assertEquals(P, i.next());
        assertEquals(A, i.next());
        assertEquals(G, i.next());
        assertEquals(C, i.next());
        assertEquals(T, i.next());
        assertEquals(X, i.next());

    }

    /**
     *  test getEdge
     */

    @Test
    public void testGetEdge(){
        Graph<String> graphGetEdge = new Graph<>();

        Node<String> Pandora = graphGetEdge.addNode("Pandora");
        Node<String> Arendelle = graphGetEdge.addNode("Arendelle");
        Node<String> Metroville = graphGetEdge.addNode("Metroville");
        Node<String> Monstropolis = graphGetEdge.addNode("Monstropolis");
        Node<String> Narnia = graphGetEdge.addNode("Narnia");
        Node<String> Naboo = graphGetEdge.addNode("Naboo");

        graphGetEdge.addEdge(150, Pandora, Arendelle);
        graphGetEdge.addEdge(42, Arendelle, Monstropolis);
        graphGetEdge.addEdge(73, Monstropolis, Naboo);
        graphGetEdge.addEdge(250, Naboo, Narnia);
        graphGetEdge.addEdge(37, Narnia, Metroville);
        graphGetEdge.addEdge(82, Pandora, Metroville);
        graphGetEdge.addEdge(105, Monstropolis, Metroville);
        graphGetEdge.addEdge(99, Metroville, Arendelle);
        graphGetEdge.addEdge(73, Naboo, Metroville);


        String[] TrueOneConnection = {"Metroville", "Pandora"};
        String[] TrueMultiConnection = {"Arendelle", "Monstropolis" , "Naboo"};
        String[] FalseOneConnection = {"Naboo", "Pandora"};
        String[] FalseMultiConnection = {"Narnia", "Arendelle", "Naboo"};

        System.out.println(graphGetEdge.getEdge(TrueOneConnection));
        System.out.println(graphGetEdge.getEdge(TrueMultiConnection));
        System.out.println(graphGetEdge.getEdge(FalseOneConnection));
        System.out.println(graphGetEdge.getEdge(FalseMultiConnection));


    }


}