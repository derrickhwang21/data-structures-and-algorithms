package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class Node<T> {
    public T data;
    public ArrayList<Edge> neighbors;

    public Node(T data){
        this.data = data;
        this.neighbors = new ArrayList<>();
    }

    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        return true;
    }

    public boolean addNeighbor(Node<T> node, int weight){
        Edge edge = new Edge(node, weight);
        this.neighbors.add(edge);
        return true;
    }


}
