package stackandqueue.queue;

import stackandqueue.IStackQueue;

public class LinkedListQueue implements IStackQueue {

    private class NodeQ {
        int value;
        NodeQ next;

        public NodeQ(int value) {
            this.value = value;
        }
    }

    //PUSH head
    //DELETE tail
    NodeQ headNode, tailNode;

    public LinkedListQueue() {
        // headNode = tailNode = null; default = null
    }

    @Override
    public boolean push(int value) {
        if (isFull()) return false;

        //TH: dac biet head va tail deu tro vao null (head = tail = null)
        NodeQ newNode = new NodeQ(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else {
            //them node vao cuoi
            //gan duoi tail node vao node cuoi
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int valua = headNode.value;

        //TH: dac biet chi co 1 node
        //update lai head va tail ve null
        if (headNode == tailNode) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }
        return valua;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        NodeQ currNode = headNode;
        while (currNode != null) {
            System.out.print(currNode.value + " ");
            currNode  = currNode.next;
        }
        System.out.println();
    }
}
