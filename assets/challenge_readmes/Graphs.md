# Graphs
CodeFellows - 401 - Java
CODE: Implement a Graph
## Challenge
The implemented Graph class should be represented as an adjacency list, and should include:
* AddNode()
* AddEdge()
* GetNodes()
* GetNeighbors
* Size()


## Approach & Efficiency
Creating a Graph specific node and edge class, each vertex in the graph is associated with the group of its neighboring vertices or edges.

In a weighted graph using adjacency list. Implementation is similar to that of unweighted graph, except we're also storing the weight information in adjacency set with every edge.




## API
Modifiers and Type      | Class       | Method    | Description | Big O |
|---                    | ---         | ---     |         --- | --- |
|  java.util*      |`Graph `  | `addNode()`   | Adds a new node to the graph then takes in the value of that node to return the added nodes | Space: O(1) Time: O(1)|
|  java.util*      |`Graph `  | `addEdge()`   | Adds a new edge between two nodes in the graph; also include the ability to have a "weight", both nodes should have already be in the Graph, takes in two nodes to be connected by the edge | Space: O(1) Time: O(1) |
|  java.util*       |`Graph `  | `getNodes()`   | Return all of the nodes in the graph as a collection |  Space: O(1) Time: O(n)
|  java.util*       |`Graph `  | `getNeighbors(Node node)`   | Returns a collection of nodes connected to the give node |  Space: O(1) Time: O(n)|
|  java.util*       |`Graph `  | `size()`   | Returns a collection of nodes connected to the give node |  Space: O(1) Time: O(1)
