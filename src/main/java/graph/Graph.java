package graph;

import java.util.HashMap;
import java.util.Map;

public class Graph<T> {

    private Map<T, Node<T>> adjacencyList;

    public Graph(){
        adjacencyList = new HashMap<>();
    }

    /** Adds a new node to the graph -
     * Takes in the value of that node -
     * Returns the added node2
     * @param node
     * @return
     */
    public boolean AddNode(T node){
    if(adjacencyList.containsKey(node)){
        return false;
    }
    adjacencyList.put(node, new Node<>(node));
    return true;
    }


    public boolean addEdge(T node1, T node2){
    return addEdge(node1, node2, 0);
    }

    /** Adds a new edge between two nodes in the graph -
     * Includes the ability to have a "weight" -
     * Takes in the two nodes to be connected by the edge
     * Both nodes should have already be in the Graph
     *
     */
    public boolean addEdge (T vertex1, T vertex2, int weight){
        if (!containsNode(vertex1) || !containsNode(vertex2)){
            throw new RuntimeException("Node does not exist");
        }
        Node<T> node1 = getNode(vertex1);
        Node<T> node2 = getNode(vertex2);
        return node1.addEdge(node2, weight);
    }

    public boolean containsNode(T node){
        return adjacencyList.containsKey(node);
    }

    private Node<T> getNode(T value){
        return adjacencyList.get(value);
    }
}
