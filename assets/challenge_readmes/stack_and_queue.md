# Stacks and Queues
Implementing a Stack and a Queue Data Structure
[Code](../../src/main/java/stacksandqueues) | [Tests](../../src/test/java/stacksandqueues)

## Challenge
Create a Node `Node` class that has properties for the value stored in the Node, and a pointer to the next node.

Create a `Stack` class that has a top property. It creates an empty Stack when instantiated


Create a `Queue` class that has a top property. It creates an empty queue when instantiated.
## Approach & Efficiency
My approach to take for both instance class of `Stack` and `Queue`, follows similar patterns of instantiating a Stack or a Queue if no other instance of the node is present.

Then with a Stack, it is a Last in First Out (LIFO) data structure. Where you add elements to the "top" of the stack, and also remove the elements from the top again. Which supports three operations `push`, `pop`, and `peek`

For a Queue, it is a First In First Out (FIFO), where elements are added to the end fo the queue, and removed from the beginning of the queue. Which supports `enqueue`, `dequeue`, and `peek`

## API
| Method | Description |
| --- | --- |
| `push(element)` | Takes any value as an argument and adds a new node with that value to the top of the stack |
| `pop()` | Does not take any argument, removes the node from the top of the stack, and returns the node |
| `peek()` | Does not take any argument and returns the node located on the top or front of the stack |
| `enqueue(element)` | Takes any value as an argument and adds a new node with that value to the back of the queue. |
| `dequeue()` | Does not take any argument, remves the node from the front of the queue, and returns the node.  |
