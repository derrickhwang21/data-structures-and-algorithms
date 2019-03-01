# Unique Characters
Cracking The Coding Interview - Chapter 1 - Question 1
Code Challenge - 18: Unique Characters

### Challenge: Code - Radix Sort
Implement an algorithm to determine if a string has all unique characters.

What if you can only use arrays?


## Approach & Efficiency

##### Approach
Create an array of boolean values, where the flat at index i indicates whether charter i in the alphabet is contained in the string. 

If you run across this character a second time, you can immediately return false

##### Efficiency
The time complexity for this code is O(n), where n is the length of the string. The space complexity is O(1).
