public class StackApp {

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<Integer>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
