public class LinkedList {



//    public static Node isPalindrome(Node head){
//
//
//
//    }

    private static Node reverse(Node head){
        Node prev = null;


        while(head!=null){
            Node next = head;
            head.next = prev;
            prev = head;
            head = next;


        }
        return head;
    }
}
