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

    void addFirst(int data){

        Node node = new Node(data);


       if (isEmpty()){
           head = tail = node;

       }else{
           node.next = head;
           head = node;
       }
        size++;

    }

    public int getKthItemFromTheLast(int k){

        Node ptr1 = head;
        Node ptr2 = head;

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;

        }
        while(ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.id;


    }

    public int getKthItemFromTheLast1(int k){

        Node ptr1 = head;
        Node ptr2 = head;
        int count = 0;



        if(k <= 0){
            throw new IllegalArgumentException("Invalid value: n = " + k);
        }

        while(count < k){
            ptr2 = ptr2.next;
            count++;
        }

        while(ptr2!=null){
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        return ptr1.id;


    }

     void removeKthNodeFromTheEnd(int k){

        if(k <= 0){
            throw new IllegalArgumentException("Invalid input k=" + k);
        }

        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = head;
        int count = 0;

        while(count < k){
            ptr2 = ptr2.next;
            count++;
        }
        while(ptr2!= null){
            prev = ptr1;
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }

        // ptr1 is on the kth element from the last
        // Do delete operation

        if(ptr1 == head){
            head = ptr1.next;
            ptr1.next = null;
            size--;
        }else if(ptr1 == tail){
            tail = prev;
            prev.next = null;
            size--;

        }else{
            prev.next = ptr1.next;
            ptr1.next = null;
            size--;

        }




    }


    void addFirstData(int data){
        Node data1 = new Node(data);

        if(isEmpty()){
            head=tail=data1;
        }else{
            data1.next = head;
            head = data1;
        }
        size++;
    }



    public int getKthItemFromLast(int k){
        Node ptr1 = head;
        Node ptr2 = head;

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;

        }
        while(ptr2!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.id;
    }


}
