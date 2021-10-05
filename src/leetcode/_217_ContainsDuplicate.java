package leetcode;

import java.util.HashSet;
import java.util.Set;

//Set
public class _217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for (int n: nums) {
            if (mySet.contains(n)) { // da ton tai trong mySet
                return true;
            }else {
                mySet.add(n);
            }
        }
        return false;
    }
}
