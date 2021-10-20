package stackandqueue.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();


        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        for (Integer integer : myQueue) {
            System.out.println(integer);
        }

        // first in first out
        System.out.println("peek: "+myQueue.peek());
        System.out.println("Remove: "+myQueue.remove());
        for (Integer integer : myQueue) {
            System.out.println(integer);
        }

        System.out.println("isEmpty: "+myQueue.isEmpty());
        System.out.println("peek: "+myQueue.peek());
        System.out.println("Remove: "+myQueue.remove());
        System.out.println("peek: "+myQueue.peek());
        System.out.println("Remove: "+myQueue.remove());
        System.out.println("isEmpty: "+myQueue.isEmpty());


    }
}
