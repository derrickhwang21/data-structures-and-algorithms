# Unique Characters
Cracking The Coding Interview - Chapter 1 - Question 5
Code Challenge - 20: String Compression

### Challenge: Code - String Compression
Implement a method to perform basic string compression using the counts of repeated characters.

If the "compressed" string would not become smaller than the original string, your method should return the original string. 

    Example
    Input: "aabcccccaaa"
    Output: "a2b1c53a"
    
   
 


## Approach & Efficiency

##### Approach
Iterating through both input strings and keeping count of how many times the character appears in a character array. 

Then we compare the character array with one another to see if there's a discrepancy. 
##### Efficiency
The time complexity for this code is O(n), where n is the length of the string. The space complexity is O(n).