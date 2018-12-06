package link;


import java.util.ArrayList;

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

//            while (trail != null && k == 0) {
//                if(trail.next != null){
//
//                }else{
//                    trail.data;
//            }
//


        for (int i = 0; i < k; i++) {

            if (head.next != null) {
                lead = lead.next;

            } else {
                throw new IndexOutOfBoundsException("value entered is out of range");
            }
        }
            while (lead.next != null) {
                lead = lead.next;
                trail = trail.next;

            }

        return trail.data;
    }

    

}
