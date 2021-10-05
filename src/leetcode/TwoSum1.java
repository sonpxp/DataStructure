package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /*public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int b = nums[i], a = target - b;
            if (seen.containsKey(a)) return new int[]{seen.get(a), i};
            seen.put(b, i);
        }
        return new int[]{};
    }*/

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 9, 4}; // --> [1,4]
        System.out.println(Arrays.toString(twoSum(array, 7)));
    }
}
