package graph;

import java.util.*;

public class Graph<T> {

    public Set<Node<T>> nodes;

    public Graph(){
        this.nodes = new HashSet<>();
    }

    /** Adds a new node to the graph -
     * Takes in the value of that node -
     * Returns the added node2
     * @param nodeData
     * @return
     */
    public Node<T> addNode(T nodeData){
        Node<T> node = new Node<>(nodeData);
        nodes.add(node);
        return node;
    }

    /** Adds a new edge between two nodes in the graph -
     * Includes the ability to have a "weight" -
     * Takes in the two nodes to be connected by the edge
     * Both nodes should have already be in the Graph
     *
     */
    public void addEdge(int weight, Node<T> nodeOne, Node<T> nodeTwo){
        if (!nodes.contains(nodeOne) || !nodes.contains(nodeTwo)){
            throw new IllegalArgumentException("Nodes must be contained in graph.");
        }
        nodeOne.addEdge(weight, nodeTwo);
        nodeTwo.addEdge(weight, nodeOne);
    }

    /**
     *
     * @return all of the nodes in the graph as a collection
     */
    public Set<Node<T>> getNodes() {
        return nodes;
    }

    /**
     * Returns a collection of nodes connected to the given node
     * @param node
     * @return collection
     */
    public Set<Edge<T>> getNeighbors(Node node){
        if(!nodes.contains(node)){
            throw new IllegalArgumentException("Node must be contained in graph");
        }
        return node.neighbors;
    }

    /**
     *
     * @return the total number of nodes in the graph
     */
    public int size() {
        return nodes.size();
    }

    /**
     * Breadth First Traversal Method
     *
     *
     * @param input Node Type
     * @return Collection of Nodes in the order they were visited
     *
     * Credit: Michelle Ferreirae for demostrating the implementation of this method using an Iterable datatype
     */
    public static Iterable<Node> bfs(Node input){
        LinkedList<Node> queue = new LinkedList<>();

        Queue<Node> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(input);

        HashSet<Node> visitedNodes = new HashSet<>();
        visitedNodes.add(input);
        while(!nodesToVisit.isEmpty()){
            Node element = nodesToVisit.poll();
            queue.add(element);
            for(Edge neighbor : (Set<Edge>) element.neighbors){
                Node neighborNode = neighbor.node;
                if(!visitedNodes.contains(neighborNode)){
                    nodesToVisit.add(neighborNode);
                    visitedNodes.add(neighborNode);
                }
            }
        }
        return queue;
    }

    /**
     * TODO Code Challenge: getEdge
     */

    /**
     * TODO Code Challenge: depthFirstTraversal
     */
}
