# Merged List
CodeFellows - 401 - Java
Code Challenge 08
## Challenge
Write a method for the Linked List Class which takes two linked lists as arguments. Zip the two linked lists together into one sot that the nodes alternate between the two lists and return a reference to the head of the zipped list

## Approach & Efficiency
Using two node pointer variable and a current node variable we alternate connections depending of if node.next would be null or not. If null we return the resepective argument node list. If not we, we move the current to the pointer.next and the other pointer to the next current.
As the current points to the next next node in the list while the two placeholders holds the the rest for the alternating list, the current moves to the next node and repeat.

### Space Efficiency
O(1)

### Time Efficiency:
O(n)




<!-- Embedded whiteboard image -->
![ll_merge](../ll_merge.jpg)
![ll_merge](../ll_merge2.jpg)