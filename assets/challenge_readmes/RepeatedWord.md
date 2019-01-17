# Repeated Word
CodeFellows - 401 - Java
Code Challenge - Find the first repeated word in a book

### Challenge: Code - HashTable
Write a function that accepts a lengthy string parameter

Return the first word to occur more than once in that provided string.

## Approach & Efficiency
Using the Java native library, we split the input string and replaced special characters as spaces to a string array.

Using the string array, we iterate through each index and store each value into a hashset if the hashset doesn't already contain that string value.

If the current index matches a word in the hashset during the iteration, we return that word. Otherwise, we return message "no repeating word".




## API
Modifiers and Type      | Class       | Method    | Description | Big O |
|---                    | ---         | ---     |         --- | --- |
|  java.util*      |`RepeatedWord `  | `getRepeatedWord(String input)`   | Take in a string and return the first repeated word in the string or false if word doesn't exist | Space: O(n) Time: O(n)|

