package createPractice;

public class Test {

    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int result=stack.pop();
        System.out.println(result);
    }
}
