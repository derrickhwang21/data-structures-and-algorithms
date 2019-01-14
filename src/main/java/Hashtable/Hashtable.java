package Hashtable;


public class Hashtable {

    private Node[] table;

    private int count;

    public Hashtable(){
        table = new Node[64];
    }

    public Hashtable(int initialSize){
        table = new Node[initialSize];
    }

    /**
     * takes in parameters to hash the key and add the key and value pair to the table, in addition to resizing the table based on load factor
     * @param key
     * @param value
     * @param factor
     */
    public void add(Object key, Object value, int factor){
        int bucket = hash(key);
        Node list = table[bucket];

        while (list != null){
            if(list.equals(key))
                break;
            list = list.next;
        }
        if (list != null){
            list.value = value;
        }
        else{
            if (count >= factor*table.length){
                resize();
            }
         Node newNode = new Node();
         newNode.key = key;
         newNode.value = value;
         newNode.next = table[bucket];
         count++;
        }
    }

    /**
     * helper method to resize the hashtable based on load factor
     */
    private void resize(){
        Node[] newTable = new Node[table.length * 2];
        for(int i = 0; i < table.length; i++){
            Node list = table[i];
            while(list != null){
                Node next = list.next;
                int hash = (Math.abs(list.key.hashCode())) % newTable.length;

                list.next = newTable[hash];
                newTable[hash] = list;
                list = next;
            }
        }
        table = newTable;
    }


    /**
     * A method that takes in a key and returns the value from key/value pair
     * @param key
     * @return
     */
    public Object find(Object key){
        int bucket = hash(key);
        Node list = table[bucket];

        while(list != null){
            if(list.key.equals(key))
                return list.value;
            list = list.next;
        }
        return null;

    }

    /**
     * helper method to return a hashed key
     * @param key
     * @return
     */
    private int hash(Object key){
        return (Math.abs(key.hashCode())) % table.length;
    }

    /**
     * A method that takes in a key and returns if the key exists in the table already
     * @param key
     * @return
     */
    public boolean contains(Object key){
        int bucket = hash(key);
        Node list = table[bucket];

        while(list != null){
            if(list.key.equals(key))
                return true;
            list = list.next;
        }
        return false;
    }

    /**
     * returns the index in the array the key is stored.
     * @param key
     * @return
     */
    public Object getHash(Object key){
        int bucket = hash(key);
        Node list = table[bucket];

        while (list != null) {
            if (list.key.equals(key))
                return bucket;
            list = list.next;
        }
        return null;


    }



}
