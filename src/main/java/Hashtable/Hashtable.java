package Hashtable;


public class Hashtable<K, V> {

    protected Node[] table;
    private int count;



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
     *
     * Get a positive hash value by iterating through the character string key input, then modulo array length.
     *
     * returns the index in the array the key is stored.
     * @return key
     */
    public int getHash(String key){
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.codePointAt(i);
        }
        hash = hash * 17 % table.length;
        return hash;

    }


    /**
     * takes in parameters to hash the key and add the key and value pair to the table, in addition to resizing the table based on load factor
     * @param key
     */
    public void add(String key, V value) {

        int bucketIndex = getHash(key);
        Node current = table[bucketIndex];

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


    /**
     * A method that takes in a key and returns the value from key/value pair
     * @param key
     * @return
     */
    public Object find(String key) {
        int bucketIndex = getHash(key);
        Node current = table[bucketIndex];

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
    public boolean contains(String key){
        int bucketIndex = getHash(key);
        Node current = table[bucketIndex];

        while (current != null) {
            if (current.key.equals(key))
                return true;
            current = current.next;
        }
        return false;
    }

    private void resize(){

        Node[] newtable = new Node[table.length*2];
        for (int i = 0; i < table.length; i++) {

            Node node = table[i];
            while (node != null) {
                Node next = node.next;
                int hash = getHash(node.key);
                node.next = newtable[hash];
                newtable[hash] = node;
                node = next;
            }
        }
        table = newtable;
    }




}
