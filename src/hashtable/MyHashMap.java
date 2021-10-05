package hashtable;

import java.util.ArrayList;

//leetcode: 706
public class MyHashMap {

    private class Data {
        int key;
        int value;

        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Data) {
                return this.key == ((Data) other).key;
            }
            return false;
        }

    }

    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];

    public MyHashMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    //return hash value
    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
    }

    private void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newDeleteData = new Data(key, 0);
        bucket.remove(newDeleteData);
    }

    private int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0)
            return bucket.get(keyIndex).value;
        return -1;
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();

        hashMap.put(1, 1);
        hashMap.put(1, 2);
        hashMap.put(10, 20);
        System.out.println("hashMap.get(1): " + hashMap.get(1));
        System.out.println("hashMap.get(2): " + hashMap.get(2));
        hashMap.remove(1);
        System.out.println("hashMap.get(1): " + hashMap.get(1));
        System.out.println("hashMap.get(10): " + hashMap.get(10));

    }
}
