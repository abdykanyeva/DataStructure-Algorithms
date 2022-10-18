package practice;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

    }

    public static Node deleteDuplicates(Node head){

        if(head == null || head.next == null) return head;

        Node current = head;

        while(current!=null){
            if(current.value == current.next.value){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}
