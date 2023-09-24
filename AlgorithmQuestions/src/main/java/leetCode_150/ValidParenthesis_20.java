package leetCode_150;

import java.util.Stack;

public class ValidParenthesis_20 {

    public static void main(String[] args) {
        System.out.println(isValid("([}}])"));

    }

    public static boolean isValid(String s) {

        //()
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char each : s.toCharArray()) {
            if (each == '(' || each == '{' || each == '[') {
                stack.push(each);
            } else if (each == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (each == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (each == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();

            }else{
                stack.push(each);
            }
        }
        return stack.isEmpty();
    }
}