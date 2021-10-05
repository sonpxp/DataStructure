package leetcode;

import java.util.HashMap;
import java.util.Map;

//Map
public class _387_FirstUniqChar {
    public static void main(String[] args) {
        firstUniqChar("leetcodelove");
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!myMap.containsKey(c)) {
                myMap.put(c, 1); //value = 1 vi day la lan dau no xuat hien
            } else {
                myMap.put(c, myMap.get(c) + 1);
            }
        }

        //duyet mang lay ra phan tu xuat hien lan dau tien
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myMap.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
