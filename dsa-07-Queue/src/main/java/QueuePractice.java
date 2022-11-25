import java.util.Stack;

public class QueuePractice {


    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    int dequeue() {

        peek();

        return stack2.pop();
    }

    int peek() {
        if (stack2.empty())
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        return stack2.peek();

    }

    boolean empty() {

        return stack1.isEmpty() && stack2.isEmpty();
    }

    void enqueue(int num) {
        stack1.push(num);

    }
}
