package hashtable;

import java.util.HashSet;
import java.util.Set;

public class HashSetJava {
    //Set: HashSet, LinkedHashSet, SortedSet -->TreeSet(Log n -> them buoc sorted tuan tu)
    //HashSet -> Array
    //LinkedHashSet -> Linked List
    //TreeSet -> Tree and implement SortedSet
    public static void main(String[] args) {
        Set<Integer> myIntSet = new HashSet<>();
        //Set<Integer> myIntSet1 = new LinkedHashSet<>();
        //Set<Integer> myIntSet2 = new TreeSet<>();
        myIntSet.add(1);
        myIntSet.add(2);
        myIntSet.add(3);
        myIntSet.add(1);
        myIntSet.add(2);

        for (Integer integer : myIntSet) {
            System.out.println(integer);
        }

        /*Set<String> myStringSet = new HashSet<>();
        myStringSet.add("Hello");
        myStringSet.add("World");

        for (String str : myStringSet) {
            System.out.println(str);
        }*/
    }
}
