package Hashtable;

public class Node<K, V> {
    protected K key;
    protected V value;
    Node<K, V> next;

    Node(K key, V value, Node<K, V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    Node(){}

    /**
     *     Hashtable class defined data-types
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    public K getKey() {
        return key;
    }



    public V getValue() {
        return value;
    }




}
