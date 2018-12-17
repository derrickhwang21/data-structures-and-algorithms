# Linked List
CodeFellows - 401 - Java
CODE: Create a Node Class
## Challenge
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node

## Approach & Efficiency
Created LinkedList and Node class

Node class created by substantiating an instance of a Node constructor object

LinkedList class implemented through instance methods "insert", "includes", and "print" and instance property "head"

Upon instantiating the head property, an empty Linked List should be created.

This object should be aware of a default empty value assigned to "head" when the linked list is instantiated




## API
| Method | Description | Time | Space |
| --- | --- | --- | --- |
| `insert(int value)` | which takes in an integer value as an argument and adds a new node with that value to the "head" of the list with an O(1) Time performance | O(1)| O(1)|
| `includes(int findValue)` | which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.| O(n) | O(1)|
| `prints()` | which takes in no arguments and outputs all of the current Node values in the Linked List. | O(n)| O(n) |
| `insertBefore(int value, int newValue)` | which takes in a value as target and adds the newValue before the target value. | O(n)| O(1) |
| `insertAfter(int value, int newValue)` | which takes in a value as target and adds the newValue before the target value. | O(n)| O(1) |
| `toIntegerArray()` | which takes in no arguments and outputs all of the current Node values into an integer array. | O(n)| O(1) |
| `kthFromEnd(int k)` | which takes in a value and returns the nth value from the end of the returns.. | O(n)| O(n) |
| `merge(LinkedList one, LinkedList two)` | which takes in two linked lists and merges both into one linked list. | O(n)| O(1) |
| `append(int value)` | which takes in an integer value and adds a new node with that value to the end of the list. | O(n)| O(n) |
