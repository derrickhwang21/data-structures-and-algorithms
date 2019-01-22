# Merge Sort Sort
CodeFellows - 401 - Java
Code Challenge - 15: Merge Sort

### Challenge: Code - Insertion Sort
Write a function that accepts an array of unsorted integers, and returns a sorted array by a recursive mergesort algorithm.


## Approach & Efficiency
We begin by identifying the key for our comparison as index i.

While the key is less than the value of index j and greater than position 0, then the key moves one position to the left. The process continues until we reach to a value that is smaller than the key. At which point we change the key to the next index of j and repeat the process until the while condition no longer applies.








## API
Modifiers and Type      | Class       | Method    | Description | Big O |
|---                    | ---         | ---     |         --- | --- |
|  java.util*      |`Graph `  | `addNode()`   | takes in an unsorted array and returns the array sorted using insertion sort | Space: O(1) Time: O(n*2)|
