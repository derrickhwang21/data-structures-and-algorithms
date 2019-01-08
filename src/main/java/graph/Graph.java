package graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Graph<T> {

    private ArrayList<Node <T>> nodes;

    public Graph(List<Edge> edges){
        this.nodes = new ArrayList<>();
    }

    /** Adds a new node to the graph -
     * Takes in the value of that node -
     * Returns the added node2
     * @param nodeData
     * @return
     */

    public Node<T> addNode(T nodeData){
        Node node = new Node(nodeData);
        this.nodes.add(node);
        return node;
    }

    /** Adds a new edge between two nodes in the graph -
     * Includes the ability to have a "weight" -
     * Takes in the two nodes to be connected by the edge
     * Both nodes should have already be in the Graph
     *
     */
    public boolean addEdge(Node<T> nodeOne, Node<T> nodeTwo){
        if (this.nodes.contains(nodeOne) && this.nodes.contains(nodeTwo)){
            nodeOne.addNeighbor(nodeTwo);
            nodeOne.addNeighbor(nodeTwo);
            return true;
        }
        return false;
    }


    /**
     *
     * @return all of the nodes in the graph as a collection
     */
    public String getNodes() {
        return this.nodes.toString();
    }

    /**
     * Returns a collection of nodes connected to the given node
     * @param node
     * @return collection
     */
    public String getNeighbors(Node<T> node){
        if (this.nodes.contains(node) && node.neighbors != null){
            return node.neighbors.toString();
        } else{
            return null;
        }
    }

    /**
     *
     * @return the total number of nodes in the graph
     */
    public int size() {
        return this.nodes.size();
    }
}
