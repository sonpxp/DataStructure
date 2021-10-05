package stackandqueue.queue;

import stackandqueue.IStackQueue;

public class ArrayQueue implements IStackQueue {

    private int[] array;
    private int SIZE;
    private int head; // tro dau
    private int tail; // tro cuoi

    public ArrayQueue(int size) {
        SIZE = size; // size do nguoi dung quyet dinh
        array = new int[SIZE];
        head = tail = -1;
    }

    @Override
    public boolean push(int value) {
        //push --> tail (index cuoi)
        if (!isFull()) {
            if (isEmpty()) {
                //truong hop dac biet
                // phan tu dau tien thi head & tail deu tro vao 1 vi tri
                head++;
            }
            tail++;
            array[tail] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // pop --> head (first in first out)
        int value = -1;
        if (!isEmpty()){
            value = array[head];
            head++;
            //TH: dac biet khi ca head va tail cung tro vao 1 index
            if (head > tail){
                head = tail = -1;
            }
        }

        return value;
    }

    public int count() {
        if (isEmpty()) {
            return 0;
        }
        int countNumber = tail - head + 1;
        return countNumber;
    }

    @Override
    public boolean isFull() {
        return tail == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (head == -1 && tail == -1);
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("Stack isEmpty");
        }else {
            for (int i = head; i <= tail; i++) {
                System.out.print(array[i]+ " ");
            }
            System.out.println();
        }
    }
}
