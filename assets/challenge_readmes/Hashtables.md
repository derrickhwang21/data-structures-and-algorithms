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
Creating a specific Node class array consisting of linkedlist for the HashTable, each HashTable stores data in the form of key, value, and the next Node. Every key is unique, but values can repeat. Everytime a key is generated. The key is passed to a hash function. In this implementation, the load factor is 0.7.

`add`
Given the key and value, we hash the key to identify the storage location in the Hashtable array. We traverse the node array to see if it exists... if exist, we appropriate the current existing node to next and the value of the current as the value. Otherwise, we add a new node at the head of the list to contain the new key and its associated value.

`find`
Given the key, we hash the key to identify the storage location in the Hashtable array. If the specified key is in the node that the list points to, we return the associated value and move to the next node in the list to look if not. If the key can't be found traversing the key, we return the value to be null.

`contains`
Given the key, we hash the key to identify the storage location in the Hashtable array. If the specified key is in the node that the list points to, we return true and move to the next node in the list to look if not. If the key can't be found traversing the key, we return the value to be false.

* `getHash`

* `resize`
Doubles the size of the table, and redistribute the key/value pairs to their proper location in the new table. We would move all the nodes in linked list in each index of the array into a new table by changing the next pointer in the node and making a pointer in the new table.




## API
Modifiers and Type      | Class       | Method    | Description | Big O |
|---                    | ---         | ---     |         --- | --- |
|  java.util*      |`Hashtable `  | `add(K, V)`   | Takes in a key and value, which will hash the key and add the key and value pair to the table. Resizes the table if the load factor becomes greater than 0.7 | Space: O(1) Time: O(1)|
|  java.util*      |`Hashtable `  | `find(K)`   | Takes in the key and returns the value from the key value pair | Space: O(1) Time: O(1) |
|  java.util*       |`Hashtable `  | `contains(K)`   | takes in the key and returns if the key exists in the table already |  Space: O(1) Time: O(1)
|  java.util*       |`Hashtable `  | `getHash(K)`   | Takes in a key and returns the index in the array the key is stored |  Space: O(1) Time: O(1)|

## Credit:
Fundamentals of Hash Functions: Tara Johnson, Vinicio Sanchez, Michelle Ferreirae

Hash Functions: "Effective Java - 3rd Edition (Joshua Bloch)" , http://www.cs.princeton.edu/courses/archive/spring07/cos226/lectures/10Hashing.pdf, https://www.cs.cmu.edu/~adamchik/15-121/lectures/Hashing/hashing.html, https://algs4.cs.princeton.edu/34hash/,

