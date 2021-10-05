package stackandqueue.stack;

public class MyMain {

    public static void main(String[] args) {
        /*ArrayStack myStack = new ArrayStack(3);

        printShow(""+myStack.push(1));
        printShow(""+myStack.push(2));
        printShow(""+myStack.push(3));
        printShow(""+myStack.push(4));
        myStack.show();

        printShow(""+myStack.pop());
        myStack.show();
        printShow(""+myStack.pop());
        printShow(""+myStack.pop());
        myStack.show();
        printShow(""+myStack.pop());
        myStack.show();*/
/*        ---------------------------------------------------------*/

        LinkedListStack linkedListStack = new LinkedListStack();

        printShow(""+linkedListStack.push(1));
        printShow(""+linkedListStack.push(2));
        printShow(""+linkedListStack.push(3));
        linkedListStack.show();

        printShow(""+linkedListStack.pop());
        linkedListStack.show();
        printShow(""+linkedListStack.pop());
        linkedListStack.show();
        printShow(""+linkedListStack.pop());
        linkedListStack.show();
        printShow(""+linkedListStack.pop());
        linkedListStack.show();
    }

    private static void printShow(String name){
        System.out.println(name);
    }
}
