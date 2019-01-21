package graph.DepthFirst;

import graph.Edge;
import graph.Node;

import java.util.*;

public class DepthFirst {

    public static Iterable<Node> depthFirst(Node input){
        LinkedList<Node> stack = new LinkedList<>();
        Stack<Node> nodesToVisit = new Stack<>();
        nodesToVisit.push(input);

        HashSet<Node> visitedNodes = new HashSet<>();
        visitedNodes.add(input);
        while(!nodesToVisit.isEmpty()){
            Node element = nodesToVisit.pop();
            stack.add(element);
            for(Edge neighbor : (Set<Edge>) element.neighbors){
                Node neighborNode = neighbor.node;
                if(!visitedNodes.contains(neighborNode)){
                    nodesToVisit.push(neighborNode);
                    visitedNodes.add(neighborNode);
                }
            }
        }
        return stack;
    }
}
