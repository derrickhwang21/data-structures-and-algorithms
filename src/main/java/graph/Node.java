package graph;

import java.util.*;

public class Node<T> {
    public T data;
    public Set<Edge<T>> neighbors;

    public Node(){
        this(null);
    }

    public Node(T data){
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    public void addEdge(int weight, Node<T> neighbor){
        Edge<T> newEdge = new Edge(neighbor, weight);
        this.neighbors.add(newEdge);
    }




}
