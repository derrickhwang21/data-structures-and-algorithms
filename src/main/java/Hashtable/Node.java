package Hashtable;

public class Node<K, V> {
    protected K key;
    protected V value;
    Node<K, V> next;

    Node(K key, V value, Node<K, V> next, final int hash){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    Node(){}
//    @Override
//    public int hashCode() {
//        int result = key != null ? key.hashCode() : 0;
//        result = 31 * result + (value != null ? value.hashCode() : 0);
//        result = 31 * result + (next != null ? next.hashCode() : 0);
//        return result;
//    }

    public K getKey() {
        return key;
    }



    public V getValue() {
        return value;
    }




}
