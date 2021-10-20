package leetcode;

import java.util.List;

public class _1662_Check_If_Two_String {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        /* Solution 1*/
        /*String result1 = "";
        String result2 = "";
        long startTime = System.currentTimeMillis();

        for (String s : word1) {
            result1 += s;
            System.out.println(result1);
            System.out.println("Thời gian nối chuỗi của lớp String 1: "
                    + (System.currentTimeMillis() - startTime) + "ms");
        }

        for (String s : word2) {
            result2 += s;
            System.out.println(result2);
            System.out.println("Thời gian nối chuỗi của lớp String 2: "
                    + (System.currentTimeMillis() - startTime) + "ms");
        }
        System.out.println(result1.equals(result2));
        return result1.equals(result2); //?true:false*/

        /* Solution 2*/
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < word1.length; i++) {
            ans1.append(word1[i]);
            System.out.println("Thời gian nối chuỗi của lớp String 1: "
                    + (System.currentTimeMillis() - startTime) + "ms");
        }

        for (int i = 0; i < word2.length; i++) {
            ans2.append(word2[i]);
            System.out.println("Thời gian nối chuỗi của lớp String 2: "
                    + (System.currentTimeMillis() - startTime) + "ms");
        }

        if (ans1.toString().equals(ans2.toString()))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        String[] w1 = {"ab", "c"};
        String[] w2 = {"a", "bc"};
        arrayStringsAreEqual(w1, w2);
        System.out.println();
    }

}
