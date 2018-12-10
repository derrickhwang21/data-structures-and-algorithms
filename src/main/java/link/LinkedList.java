package link;


import java.util.ArrayList;



public class LinkedList {

    public Node head;


    public void insert(int data) {
        Node newNode = new Node(data, this.head);
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

    /**
     * Code Challenge - 07: kth_from_the_end
     */

    public int kthFromEnd(int k) {

        if (head == null) {
            return 0;
        }
        Node lead = head;
        while (k >= 0) {
            lead = lead.next;
            k--;
        }
        Node tail = head;
        while (lead != null) {
            lead = lead.next;
            tail = tail.next;
        }
        int i = tail.data;
        return i;
    }

    /**
     * Code Challenge: 08
     * Merge Two Linked Lists
     */

    public static LinkedList merge(LinkedList one, LinkedList two) {

        Node current = one.head;
        Node placeHolder1 = current;
        Node placeholder2 = two.head;

        if (one.head == null) {
            return two;

        } else if (two.head == null) {
            return one;

        }

        while (current != null && placeholder2 != null && placeHolder1 != null) {
            placeHolder1 = current.next;
            current.next = placeholder2;
            current = current.next;
            placeholder2 = current.next;

            if (placeHolder1 != null) {
                current.next = placeHolder1;
                current = current.next;
            }
        }
        return one;

    }

}
