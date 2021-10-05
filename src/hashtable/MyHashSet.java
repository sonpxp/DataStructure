package hashtable;

import java.util.ArrayList;

//leetcode: 705
public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> mBucket[];

    public MyHashSet() {
        mBucket = new ArrayList[SIZE];
        for (int i = 0; i < mBucket.length; i++) {
            mBucket[i] = new ArrayList<>();
        }
    }

    //return hash value
    private int hashFunction(int key){
        return key % SIZE;
    }

    private void add(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = mBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0){
            bucket.add(key);
        }
    }

    private void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = mBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0){
            bucket.remove(keyIndex);
        }
    }

    private boolean contains(int key){
        // KIEM TRA 1 PHAN TU CO TON TAI HAY KHONG
        int hashValueIndex = hashFunction(key);
        var bucket = mBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    /*public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println("Contains(1): "+myHashSet.contains(1) );
        myHashSet.remove(1);
        System.out.println("Contains(1): "+myHashSet.contains(1) );

    }*/
}
