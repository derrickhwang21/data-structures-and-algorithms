# HashTable
CodeFellows - 401 - Java
CODE: Implement Hash Tables

### Challenge: Code - HashTable
The implemented Graph class should be represented as an adjacency list, and should include:
* `add`
* `find`
* `contains`
* `contains`
* `getHash`


## Approach & Efficiency
Creating a Hashtable specific nodeclass, each HashTable stores data in the form of key and value. Every key is unique, but values can repeat. Everytime a key is generated. The key is passed to a hash function. In this implementation, the load factor is 0.7.




## API
Modifiers and Type      | Class       | Method    | Description | Big O |
|---                    | ---         | ---     |         --- | --- |
|  java.util*      |`Hashtable `  | `add(K, V)`   | Takes in a key and value, which will hash the key and add the key and value pair to the table. Resizes the table if the load factor becomes greater than 0.7 | Space: O(1) Time: O(1)|
|  java.util*      |`Hashtable `  | `find(K)`   | Takes in the key and returns the value from the key value pair | Space: O(1) Time: O(n) |
|  java.util*       |`Hashtable `  | `contains(K)`   | takes in the key and returns if the key exists in the table already |  Space: O(1) Time: O(n)
|  java.util*       |`Hashtable `  | `getHash(K)`   | Takes in a key and returns the index in the array the key is stored |  Space: O(1) Time: O(1)|

