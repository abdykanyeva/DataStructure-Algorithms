package PrintMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <= 7; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }
    public static void printMiddle(MySinglyLinkedList sll) {

        // create two pointers
        Node a = sll.head;
        Node b = sll.head;

        while(b!=sll.tail && b.next!=sll.tail){
            a = a.next;
            b = b.next.next;
        }
        if(b == sll.tail){
            System.out.println(a.id);
        }else{
            System.out.println(a.id +","+ a.next.id);
        }



    }

}
