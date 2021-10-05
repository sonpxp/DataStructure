import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String x = "a b c d 326745";
        x.toCharArray();
        System.out.println(x);
    }

    /*public static boolean isValid(String s) {
        Stack<Character> array.stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                array.stack.push(')');
            if (c == '[')
                array.stack.push(']');
            if (c == '{')
                array.stack.push('}');
            else if (array.stack.isEmpty() || array.stack.pop() != c) {
                System.out.println("fasle");
                return false;
            }
        }

        return array.stack.isEmpty();
    }*/
}
