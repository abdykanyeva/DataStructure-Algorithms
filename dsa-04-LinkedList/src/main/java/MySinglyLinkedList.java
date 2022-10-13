public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;



    boolean isEmpty(){
       return head == null;
    }

    void add(int data){
        Node input = new Node(data);
        if(isEmpty()){
            head = tail = input;
            size++;
        }
        else{
            tail.next = input;
            tail = input;
            size++;
        }
    }

    void printNodes(){
        Node current = head;

        while(current != null){
            if(current.next == null) {
                System.out.print(current.id + "=>null");
            }else{
                System.out.print(current.id + "=>");
            }

            current = current.next;

        }
    }

    void deleteById(int id){

        // check if empty
        if(isEmpty()) System.out.println("List is empty!");
        // assign prev and current with head
        Node prev = head;
        Node current = head;

        while(current!=null){

        //    if(){  // there is a match
                //case 1: head
                //case 2: ail
                //case 3: middle

   //         }



            prev = current;
            current = current.next;
        }


    }

}
