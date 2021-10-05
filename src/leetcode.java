import java.util.Stack;

public class leetcode {

    public static void main(String[] args) {
        System.out.println(isValid("[]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        /*for (char c : s.toCharArray()) {
         *//*if (c == '(')
                stack.push(')');
            if (c == '{')
                stack.push('}');*//*
            if (c == '['){
                stack.push(']');
                System.out.println(stack);
            }

            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();*/

        /*-------------------------------*/
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{'|| c == '['){
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;
                char openPeek = stack.peek();
                if (c == ')' && openPeek == '('
                        || c == '}' && openPeek == '{'
                        || c == ']' && openPeek == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
