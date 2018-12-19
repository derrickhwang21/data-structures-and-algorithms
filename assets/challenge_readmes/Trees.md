# Binary Tree & Binary Search Tree Implementation
CodeFellows - 401 - Java
CODE: Create a Binary/Binary-Search Tree class
## Challenge
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

Create a BinaryTree Class
* Define a method for each of the depth first traversals `preOrder`, `inOrder`, `postOrder` which takes in a root node and returns an arryay of the nodes.

Create a BinarySearchTree class
* Define a method `add` that adds a new node in the correct location in the binary search tree
* Define a method named `search` that brings in a value of node, and returns the node with the desired value

## Approach & Efficiency
Using a recursive method, for my methods, aside for it seeming more elegant by being less verbose; a binary tree is a recursive data structure where each node can have 2 children at most.

For the implementation, I used a Node class which store any type data T.




## API
Modifiers and Type      | Class       | Method    | Description |
|---                    | ---         | ---     |         --- |
|  java.util.List       |`BinaryTree `  | `preOrder()`   | vists the root node, then the left subtree, and finally the right subtree |
|  java.util.List       |`BinaryTree `  | `postOrder()`   | vists the left subtree, the right subtree and the root node at the end |
|  java.util.List       |`BinaryTree `  | `inOrder()`   | inOrder - first visiting the left sub-tree, then the root node, and finally the right subtree |
|  void       |`BinarySearchTree `  | `add(T value)`   | recursive method to insert new node with T value  |
|  boolean       |`BinarySearchTree `  | `containsNode(T value)`   | recursive method check if the node with T value exists |
