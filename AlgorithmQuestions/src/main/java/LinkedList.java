public class LinkedList {





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

    public static Node getElements(Node head, Integer a, Integer b){

        // first assign head to current and create counter
        // go through each element, check whether element equal to a
        // continue to traverse check whether element number equal to b
        // delete n nodes (write last a nodes will point last b nodes) => two pointer keep a delete b


        Node current = head;
        Node lastAnode = head;

        while(current != null) {
           int countA = a;
           int countB = b;
            //go through each element, check whether element equal to a
            while (current != null && countA != 0) {
                lastAnode = current;
                current = current.next;


                countA--;
            }
            //continue to traverse check whether element number equal to b
            while (current != null && countB != 0) {
                current = current.next;
                countB--;
            }
            // delete n nodes (write last a nodes will point last b nodes) => two pointer keep a delete b

            lastAnode.next = current;

        }
        return head;


    }






}
