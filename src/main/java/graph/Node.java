package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Node<T> {
    private T vertex;

    private List<Edge<T>> edges;

    private Node<T> parent;

    private boolean isVisited;

    public Node(T vertex){
        this.vertex = vertex;
        this.edges = new ArrayList<>();
    }

    public T vertex(){
        return vertex;
    }

    public boolean addEdge(Node<T> node, int weight){
        if (hasEdge(node)){
            return false;
        }
        Edge<T> newEdge = new Edge<>(this, node, weight);
        return edges.add(newEdge);
    }

    public boolean hasEdge(Node<T> node){
        return findEdge(node).isPresent();

    }
    private Optional<Edge<T>> findEdge(Node<T> node){
        return edges.stream()
                .filter(edge -> edge.isBetween(this, node))
                .findFirst();
    }


}
