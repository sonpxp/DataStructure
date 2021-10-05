package stackandqueue.queue;

public class MyMain2 {
    public static void main(String[] args) {
        /*ArrayQueue queue = new ArrayQueue(3);

        printShow(""+queue.push(1));
        printShow(""+queue.push(2));
        printShow(""+queue.push(3));
        printShow(""+queue.push(4));
        queue.show(); // list = 1 2 3 (4 ko add dc vi size full)

        // pop ra 1 vi 1 la index vao truoc
        // first in first out
        //list con 2 3
        printShow(""+queue.pop());
        queue.show();
        printShow(""+queue.pop());
        queue.show();
        printShow(""+queue.pop());
        queue.show();
        printShow(""+queue.pop());
        queue.show();*/

        //-----------------------------------------------------//
        LinkedListQueue listQueue = new LinkedListQueue();
        printShow(""+listQueue.push(1));
        printShow(""+listQueue.push(2));
        printShow(""+listQueue.push(3));
        listQueue.show();

        printShow(""+listQueue.pop());
        listQueue.show();
        printShow(""+listQueue.pop());
        listQueue.show();
        printShow(""+listQueue.pop());
        listQueue.show();
        printShow(""+listQueue.pop());
        listQueue.show();
    }


    private static void printShow(String name){
        System.out.println(name);
    }
}
