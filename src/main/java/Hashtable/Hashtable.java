package Hashtable;


import jdk.nashorn.internal.ir.ReturnNode;

import java.util.ArrayList;

public class Hashtable<K, V> {

    protected ArrayList<Node<K, V>> table;

    // current size of array list
    private int size;
    // capacity of array list
    private int numberOfBuckets;

    // Hashtable Constructor
    public Hashtable(){
        table = new ArrayList<>();
        numberOfBuckets = 16;
        size = 0;

        for(int i = 0; i < numberOfBuckets; i++)
            table.add(null);
    }

    // return the size of array list
    public int size(){ return size;}
    // return the capacity of the array list
    public int getBuckets(){ return numberOfBuckets;}

    public boolean isEmpty(){return size() == 0;}

    /**
     * returns the index in the array the key is stored.
     * @param key
     * @return
     */
    public int getHash(K key){
        int hashCode = key.hashCode();
        int index = hashCode % numberOfBuckets;
        return index;

    }

    /**
     * takes in parameters to hash the key and add the key and value pair to the table, in addition to resizing the table based on load factor
     * @param key
     */
    public void add(K key, V value) {

        int bucketIndex = getHash(key);
        Node<K, V> current = table.get(bucketIndex);

        while (current != null) {
            if (current.key.equals(key)){
                current.value = value;
                return;
            }
            current = current.next;
        }
        // Creating new Node with key and value parameter in the arraylist
        size++;
        current = table.get(bucketIndex);
        Node<K, V> newNode = new Node<K,V>(key, value);
        newNode.next = current;
        table.set(bucketIndex, newNode);
        // Resizes the capacity of the array list based on load factor of 0.7
        if ((1.0 * size)/ numberOfBuckets >= 0.7){
            ArrayList<Node<K, V>> temp = table;
            table = new ArrayList<>();
            numberOfBuckets = 2 * numberOfBuckets;
            size = 0;
            for (int i = 0; i < numberOfBuckets; i++)
                table.add(null);
            for (Node<K, V> currentNode : temp){
                while (currentNode != null){
                    add(currentNode.key, currentNode.value);
                    currentNode = currentNode.next;
                }
            }
        }
    }

    /**
     * A method that takes in a key and returns the value from key/value pair
     * @param key
     * @return
     */
    public V find(K key) {
        int bucketIndex = getHash(key);
        Node<K, V> current = table.get(bucketIndex);

        while (current != null) {
            if (current.key.equals(key))
                return current.value;
            current = current.next;
        }
        return null;
    }

    /**
     * A method that takes in a key and returns if the key exists in the table already
     * @param key
     * @return
     */
    public boolean contains(K key){
        int bucketIndex = getHash(key);
        Node<K, V> current = table.get(bucketIndex);

        while (current != null) {
            if (current.key.equals(key))
                return true;
            current = current.next;
        }
        return false;
    }




}
