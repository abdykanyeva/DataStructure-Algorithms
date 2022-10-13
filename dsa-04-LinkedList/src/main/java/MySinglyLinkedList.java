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
                System.out.println(current.id + "=>null");
            }else{
                System.out.print(current.id + "=>");
            }

            current = current.next;

        }
    }



    void deleteById(int id){

        if(isEmpty()) System.out.println("List is empty!");

        Node prev = head;
        Node current = head;

        while(current!=null){

            if(current.id == id){
                if(current == head){
                    head = current.next;
                    current.next = null;
                }
                else if(current == tail){
                     tail = prev;
                    prev.next = null;
                }
                else{
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }


            prev = current;
            current = current.next;
        }

    }

    int indexOf(int id){

        if(isEmpty()) return -1;
        int pos = 0;
        Node current = head;

        while(current!=null){
            if(current.id == id) {
                return pos;
            }else{
                pos++;
                current = current.next;
            }
        }
        return -1;
    }


}
