package createPractice.queue;

public class Queue {

    int[]array;
    int topOfQueue;
    int beginningOfQueue;


    public Queue(int size){
        this.array=new int[size];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        System.out.println("The Queue is successfully created: " + size);
    }


    public boolean isFull(){
        if(topOfQueue== array.length-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(beginningOfQueue==-1 || beginningOfQueue== array.length){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("The queue is full");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            array[topOfQueue]=value;
            System.out.println("The value is inserted to the queue");
        }
        else{
            topOfQueue++;
            array[topOfQueue]=value;
            System.out.println("The value is inserted successfully");
        }
    }

    //dequeue

    public int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
        }else{
            int result = array[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=topOfQueue=-1;
            }return result;
        }
        return -1;

    }
}
