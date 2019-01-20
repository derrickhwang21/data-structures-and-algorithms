package Hashtable;


import jdk.nashorn.internal.ir.ReturnNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hashtable<K, V> {

    protected Node<K, V>[] table;
    private int count;
    protected List<K> keys;


    // current size of array list
    private int size;


    // Hashtable Constructor
    public Hashtable(){
        table = new Node[16];
    }

    // return the size of array list
    public int size(){ return size;}
    // return the capacity of the array list

    public boolean isEmpty(){return size() == 0;}


    /**
     * Modular Hashing- converting using our defined `hashCode()` to an array index between 0 and M-1, since the @Override hashCode() returns a value between -2^31 and (2^31 - 1).
     *
     * Get a positive hash value by changing the most significant bit to zero (if not already), then modulo array length.
     *
     * See - Hash table node class to reference @Override hashCode().
     *
     * returns the index in the array the key is stored.
     * @return key
     */
    public int getHash(K key){
        return (key.hashCode() & 0x7fffffff) % table.length;

    }


    /**
     * takes in parameters to hash the key and add the key and value pair to the table, in addition to resizing the table based on load factor
     * @param key
     */
    public void add(K key, V value) {

        int bucketIndex = getHash(key);
        Node<K, V> current = table[bucketIndex];

        while (current != null) {
            if (current.key.equals(key))
                break;
            current = current.next;
            }
            if (current != null){
                current.value = value;
            }
            else{
                if (count >= 0.75 * table.length){
                    resize();
                }
                Node newNode = new Node();
                newNode.key = key;
                newNode.value = value;
                newNode.next = table[bucketIndex];
                table[bucketIndex] = newNode;
                size++;
            }


    }
//    public V add(K key, V value){
//        int hash = getHash(key);
//
//        for(Node<K,V> node = table[hash]; node != null; node = node.next){
//            if(key.equals(node.key)){
//                V oldValue = node.value;
//                node.value = value;
//                return oldValue;
//            }
//        }
//
//        Node<K, V> node = new Node<K,V>(key, value, table[hash], hash);
//        table[hash] = node;
//
//        return null;
//
//    }

    /**
     * A method that takes in a key and returns the value from key/value pair
     * @param key
     * @return
     */
    public V find(K key) {
        int bucketIndex = getHash(key);
        Node<K, V> current = table[bucketIndex];

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
        Node<K, V> current = table[bucketIndex];

        while (current != null) {
            if (current.key.equals(key))
                return true;
            current = current.next;
        }
        return false;
    }

    private void resize() {


        Node[] newtable = new Node[table.length*2];
        for (int i = 0; i < table.length; i++) {

            Node node = table[i];
            while (node != null) {
                Node next = node.next;
                int hash = (Math.abs(node.key.hashCode())) % newtable.length;
                node.next = newtable[hash];
                newtable[hash] = node;
                node = next;
            }
        }
        table = newtable;
    }




}
