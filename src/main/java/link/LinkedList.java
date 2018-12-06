package link;


import java.util.ArrayList;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class LinkedList {

    public Node head;


    public void insert(int data) {
        Node newNode = new Node(data, this.head);
//        newNode.next = this.head;
        this.head = newNode;
    }


    /**
     * takes any value as an argument and returns a boolean
     * depending on whether that value exists as a node's value
     */
    public boolean includes(int findValue) {
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.data == findValue) {
                return true;
            }
            currentNode = currentNode.next;

        }
        return false;


    }

    /**
     * takes in no arguments and out puts all of the current nodevalues in the linked list
     */
    public void print() {

        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

    }

    public ArrayList toIntegerArray() {


        ArrayList<Integer> array = new ArrayList<>();
        Node currentNode = this.head;
        while (currentNode != null) {
            array.add(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(array);
        return array;
    }

    public void append(int value) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = new Node(value, null);
                break;

            }
            currentNode = currentNode.next;
        }
    }

    public void insertBefore(int value, int newValue) {
        if (!includes(value)) {
            return;
        }

        Node currentNode = this.head;
        if (this.head.data == value) {
            this.insert(newValue);
            return;
        }
        while (currentNode != null) {
            if (currentNode.data == value) {
                currentNode.next = new Node(newValue, currentNode.next);
                break;

            }
            currentNode = currentNode.next;
        }

    }

    public void insertAfter(int value, int newValue) {
        if (!includes(value)) {
            return;
        }

        Node currentNode = this.head;


        while (currentNode != null) {
            if (currentNode.next.data == value) {
                currentNode.next = new Node(newValue, currentNode.next);
                break;

            }
            currentNode = currentNode.next;
        }

    }



    public int kthFromEnd(int k) {

        Node lead = this.head;
        Node trail = this.head;


            while(lead != null) {
                trail = lead;
            for(int i = 0; i< k; i++){
            if(trail.next == null &&  i != k - 1){
                return -1;
            }

                trail = trail.next; }

                if (trail.next == null) {
                    return lead.data;
                }
                lead = lead.next;
            }
        return -1;
    }

    /**
     *
     * Code Challenge: 08
     * Merge Two Linked Lists
     *
     */

    public static LinkedList merge(LinkedList one, LinkedList two){




        if(one.head == null) {
            return two.head;
        }
        if(two.head == null) {
            return one.head;
        }
        Node current1 = one.head;
        Node placeHead1 = current1.next;

        Node current2 = two.head;
        Node placeHead2 = current2.next;

        while ( current1 != null){
            placeHead1 = current1;
            placeHead2 = current2;

            current1.next = placeHead2.next;
            current2.next = placeHead1.next;


        }

        if (current1.next == null){
            current1.next = current2;
        }
        else if (current2 != null){
            current1.next = current2;
        }
        return one;
    }
}
