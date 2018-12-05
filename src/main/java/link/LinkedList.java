package link;

import sun.awt.image.ImageWatched;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class LinkedList{

    public Node head;



    public void insert(int data){
        Node newNode = new Node(data, this.head);
        newNode.next = this.head;
        this.head = newNode;
    }



    /**
     * takes any value as an argument and returns a boolean
     * depending on whether that value exists as a node's value
     */
    public boolean includes(int findValue){
        Node currentNode = head;

        while( currentNode != null){
            if (currentNode.data == findValue){
                return true;
            }
            currentNode = currentNode.next;

        }
        return false;


    }

    /**
     * takes in no arguments and out puts all of the current nodevalues in the linked list
     */
    public void print(){

        Node currentNode = this.head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

    }

    public ArrayList toIntegerArray(){


        ArrayList<Integer> array = new ArrayList<>();
        Node currentNode = this.head;
        while(currentNode != null){
            array.add(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(array);
        return array;
    }

//    public void append(int value){
//        Node currentNode = this.head;
//        while(currentNode != null){
//            currentNode = currentNode.next;
//        }
//        currentNode.next = new Node(value, null);
//
//    }

//    public void insertBefore(int value, int newValue) {
//        if (this.head.data == value) {
//            this.insert(newValue);
//            return;
//
//            Node currentNode = this.head;
//            while (currentNode != null) {
//                if (currentNode.next.data == value) {
//                    Node newNode = new Node(newValue, currentNode);
//                    currentNode = newNode;
//                }
//                currentNode = currentNode.next;
//            }
//        }
//    }
//
//    public void insertAfter(int value, int newValue) {
//            if (this.head.data == value) {
//                this.insert(newValue);
//                return;
//
//                Node currentNode = this.head;
//                while (currentNode != null) {
//                    if (currentNode.next.data == value) {
//                        Node newNode = new Node(newValue, currentNode.next);
//                        currentNode = newNode;
//                    }
//                    currentNode = currentNode.next;
//                }
//
//
//            }
//        }
//
}
