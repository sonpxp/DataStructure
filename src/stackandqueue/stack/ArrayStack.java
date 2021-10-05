package stackandqueue.stack;

import stackandqueue.IStackQueue;

public class ArrayStack implements IStackQueue {

    private int[] array;
    private int SIZE;
    private int topIndex;

    public ArrayStack(int size) {
        SIZE = size; // size do nguoi dung quyet dinh
        array = new int[SIZE];
        topIndex = -1; // array.stack empty
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int value = array[topIndex]; //lay ra phan tu dau tien
            topIndex--;
            return value;
        }
        return -1; // -1 thi ko co gi pop ---> isEmpty
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0; // Vi neu bang 0 thi bang phan tu dau tien
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("Stack isEmpty");
        }else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(array[i]+ " ");
            }
            System.out.println();
        }
    }
}
