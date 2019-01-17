#
CodeFellows - 401 - Java
Code Challenge - Implement a simplified Left Join for 2 hashmaps

### Challenge: Code - HashTable
Write a function that Left Joins two hashmaps into a single data structure.

The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values

The second paramter is a hashmap that has word strings as keys, and antonyms of the key as values.

Combine the key and corresponding values(if they exist) into a new data structure according to Left Join logic

Left Join - means all the values in the first hashmap are returned, and if values exist in the "right" hashmap, they are appended to the result row. If no value exist in the right hashmap, then some flavor of NULL should be appended to the result row.

## Approach & Efficiency
Currently developing.




## API
Modifiers and Type      | Class       | Method    | Description | Big O |
|---                    | ---         | ---     |         --- | --- |
|  java.util*      |`RepeatedWord `  | `getRepeatedWord(String input)`   | Take in a string and return the first repeated word in the string or false if word doesn't exist | Space: O(n) Time: O(n)|
