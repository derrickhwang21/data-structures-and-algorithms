package link;

import java.util.NoSuchElementException;

public class LinkedList<AnyType> {

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("p");
        list.addFirst("a");
        list.addFirst("e");
        list.addFirst("h");
        System.out.println(list.print());
    }

    private Node head;



    public void addFirst(Object data){
        head = new Node(data, head);
    }


    public void insert (Node key, Object toInsert){
        // takes any values as an argument and
        // adds a new node with that value to the head
        if (head == null){

        }
        if(head.data.equals(key)){
            addFirst(toInsert);
        }

        Node previous = null;
        Node current = head;

        while(current != null && !current.data.equals(key)){
            previous = current;
            current = current.next;
        }
        if(current != null){
            previous.next = new Node(toInsert, current);

        }



    }

//    public Node includes{
        /**
         * takes any value as an argument and returns a boolean
         * depending on whether that value exists as a node's value
         */


//    }


    public String print(){
        /**
         * takes in no arguments and out puts all of the current nodevalues in the linked list
         */
        Node nextNode;
        nextNode = head;
        String result = head.data + " ";
        if (head.next != null){

            result += head.next.toString();
        }
        return result;


    }





}
