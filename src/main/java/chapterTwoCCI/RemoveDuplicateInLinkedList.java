package chapterTwoCCI;




public class RemoveDuplicateInLinkedList {

    public static void removeduplicate(LinkedListNode head){

        if(head == null) return;

        LinkedListNode currentCursor = head;

        while(currentCursor != null){
            LinkedListNode leadCursor = currentCursor;
            while (leadCursor.next != null){
                if(leadCursor.next.data == currentCursor.data){
                    leadCursor.next = leadCursor.next.next;
                } else{
                    leadCursor = leadCursor.next;
                }
            }
            currentCursor = currentCursor.next;
        }
    }

}
