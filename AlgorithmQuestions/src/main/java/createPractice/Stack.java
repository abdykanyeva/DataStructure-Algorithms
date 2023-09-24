package createPractice;

public class Stack {
    int[]array;
    int topOfStack;


    public Stack(int size) {
        this.array = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of "+ size);
    }


    //isEmpty
    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        }else{
            return false;
        }
    }


    //isFull  1,2,3,4

    public boolean isFull(){
        if(topOfStack==array.length-1){
            return true;
        }else{
            return false;
        }
    }

    //push

    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }else{
            array[topOfStack+1]=value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else{
           int topStack=array[topOfStack];
           topOfStack--;
            return topStack;
        }

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else {
            return array[topOfStack];
        }

    }

}
