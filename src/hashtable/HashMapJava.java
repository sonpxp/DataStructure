package hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//leetcode: 387
public class HashMapJava {
    //Map(4): HashMap, LinkedHashMap, HashTable, SortedMap --> TreeMap
    //HashMap: hashFun(Array) NoSynchrony(Single thread)
    //LinkedHashMap: Linked _nhanh hon, toi uu bo nho hon array
    //HashTable: hashFun(Array) Synchrony(multi thread)
    //TreeMap: Tree (sap xep theo thu tu cua key nen hieu nang thap hon)

    //Map: put, get, containsKey
    //moi phan tu trong map laf 1 Entry
    //Entry chua key, value cua phan tu do

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        //key: gia tri phan tu trong mang
        //value: so lan xuat hien cac phan tu trong mang
        Map<Integer, Integer> myMap = new HashMap<>();
        //Map<Integer, Integer> myMap1 = new TreeMap<>();


        for (int i : arr) {
            if (!myMap.containsKey(i)) {
                //i chua xuat hien trong map
                myMap.put(i, 1);
            } else {
                // i da xuat hien
                int soLanXuatHien = myMap.get(i);
                soLanXuatHien++;
                myMap.put(i, soLanXuatHien);
            }
        }

        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " xuat hien: " + entry.getValue());
        }

        //test case 2
        //testString();
    }

    private static void testString() {
        String[] arr = {"xin", "chao", "cac", "ban", "xin", "xin"};
        Map<String, Integer> myMap = new HashMap<>();
        //key: luc nay la String
        //value: Integer vi mik can dem so lan xuat hien trong mang

        for (String j : arr) {
            if (!myMap.containsKey(j)) {
                //i chua xuat hien trong map
                myMap.put(j, 1);
            } else {
                // i da xuat hien
                int soLanXuatHien = myMap.get(j);
                soLanXuatHien++;
                myMap.put(j, soLanXuatHien);
            }
        }

        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " xuat hien: " + entry.getValue());
        }
    }
}
