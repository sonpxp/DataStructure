package stackandqueue.stack;

import stackandqueue.IStackQueue;

import java.util.ArrayList;

public class LinkedListStack implements IStackQueue {

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node topNode;

    public LinkedListStack() {
        // khong can khai bao size
        // lơi thế của linked list so với array là tối ưu bộ nhớ
        //topNode = null; default = null
    }

    @Override
    public boolean push(int value) {
        // Them 1 phan tu vao dou linked list -> STACK = TOP
        if (!isFull()) {
            Node newNode = new Node(value);
            newNode.next = topNode; // tao moi va tro vao cai cu
            topNode = newNode; // gan dau moi = node moi
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) return -1;
        int valua = topNode.value;
        topNode = topNode.next;
        return valua;
    }

    @Override
    public boolean isFull() {
        return false; // chi khi tran bo nho thi no moi full
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = topNode;
        //add vao array print cho de nhin
        ArrayList<Integer> tempList = new ArrayList<>();
        //
        while (temp != null) {
            //System.out.print(temp.value + "");
            tempList.add(temp.value);
            temp = temp.next;
        }

        for (int i = tempList.size() - 1; i >= 0; i--) {
            System.out.print(tempList.get(i) + " ");
        }
        System.out.println();
    }
}
