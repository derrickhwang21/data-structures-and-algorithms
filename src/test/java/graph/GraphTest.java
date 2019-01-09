package graph;

import org.junit.jupiter.api.Test;
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

        assertEquals(1, node1.neighbors.size(),"node 1 should have one neighbor");
        assertEquals(node2, node1.neighbors.iterator().next().node,"That neighbor should be node 2");
        assertEquals(1,node1.neighbors.iterator().next().weight,"weight should be 1");

        assertEquals(1, node2.neighbors.size(),"node 2 should have one neighbor");
        assertEquals(node1, node2.neighbors.iterator().next().node,"That neighbor should be node 2");
        assertEquals(1,node2.neighbors.iterator().next().weight,"weight should be 1");
    }

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

    @Test
    public void size() {
        Graph g = new Graph();
        assertEquals(0, g.size());

        g.addNode("A");
        assertEquals(1, g.size());

        g.addNode("B");
        assertEquals(2, g.size());
    }
}