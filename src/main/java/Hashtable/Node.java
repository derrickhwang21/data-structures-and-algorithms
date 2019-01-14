package Hashtable;

public class Node {
    protected Object key;
    protected Object value;
    protected Node next;

    Node (Object key, Object value, Node next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    Node(){
    }
    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
