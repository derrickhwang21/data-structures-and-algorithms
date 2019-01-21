package Hashtable;

public class Node<V> {
    protected String key;
    protected V value;
    Node next;

    Node(String key, V value){
        this.key = key;
        this.value = value;
        this.next = null;
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





}
