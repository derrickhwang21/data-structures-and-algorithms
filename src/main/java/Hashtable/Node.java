package Hashtable;

public class Node<K, V> {
    protected K key;
    protected V value;
    Node<K, V> next;

    Node(K key, V value){
        this.key = key;
        this.value = value;

    }


    public K getKey() {
        return key;
    }



    public String getValue() {
        return value.toString();
    }




}
