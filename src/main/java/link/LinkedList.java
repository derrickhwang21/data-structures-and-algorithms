package link;

import java.util.NoSuchElementException;

public class LinkedList{

    private Node head;




    public void insert(Object data){
        Node newNode = new Node(data, this.head);
        newNode.next = this.head;
        this.head = newNode;
    }



    /**
     * takes any value as an argument and returns a boolean
     * depending on whether that value exists as a node's value
     */
//    public Node includes{
//
//
//
//    }

    /**
     * takes in no arguments and out puts all of the current nodevalues in the linked list
     */
    public void print(){


        Node currentNode = this.head;
        while (currentNode != null){
            System.out.print(currentNode.data + " " );
            currentNode = currentNode.next;
        }



    }





}
