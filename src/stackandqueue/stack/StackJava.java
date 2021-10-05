package stackandqueue.stack;

import java.util.Stack;

public class StackJava {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        for (Integer integer: myStack) {
            System.out.println(integer);
        }

        System.out.println("peek: "+ myStack.peek());
        System.out.println("Pop: "+ myStack.pop());
        System.out.println("peek: "+ myStack.peek());

        System.out.println("isEmpty: "+ myStack.isEmpty());

        /*for (Integer integer: myStack) {
            System.out.println(integer);
        }*/
    }
}
