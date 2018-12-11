# Binary Search
CodeFellows - 401 - Java
Challenge 03 Data & Algorithm Challenge
## Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
Using th binary search method, I referenced the middle element of the input array by dividing the length of the array bt half. From which point using conditional statement to compare the middle element with the key input value to return its value if it matched. If the key input value is less than the middle element, the search contines in the lower half of the array. If the key input value is grater than the middle element, the search contines in the upper half of the array. By doing this, the algorithm eliminates the half in which the target value cannot lie in each iteration and returning -1 if middle element never matched to key input value.
## Solution
<!-- Embedded whiteboard image -->
![BinarySearch White Board](../BinarySearch.jpg)
