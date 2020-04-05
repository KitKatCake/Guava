package Gek;

import java.util.*;

public class ReverseDemo {
    public static void main(String[] args) {
//        // Let us create a list of strings
//        List<String> mylist = new ArrayList<String>();
//        mylist.add("practice");
//        mylist.add("code");
//        mylist.add("quiz");
//        mylist.add("geeksforgeeks");
//
//        System.out.println("Original List : " + mylist);
//
//        // Here we are using reverse() method
//        // to reverse the element order of mylist
//        Collections.reverse(mylist);
//
//        System.out.println("Modified List: " + mylist);


//        // Let us create an array of integers
//        Integer arr[] = {10, 20, 30, 40, 50};
//
//        System.out.println("Original Array : " +
//                Arrays.toString(arr));
//
//        // Please refer below post for details of asList()
//        // https://www.geeksforgeeks.org/array-class-in-java/
//        Collections.reverse(Arrays.asList(arr));
//
//        System.out.println("Modified Array : " +
//                Arrays.toString(arr));


//        Set<String> sets = new HashSet<String>();
//        sets.add("one");
//        sets.add("two");
//        sets.add("three");

        Set<String> sets = new HashSet<>() {
            {
                add("one");
                add("two");
                add("three");
            }
        };

        // ...

        // Now pass above collection as parameter to method
        useInSomeMethod(sets);
    }

    private static void useInSomeMethod(Set<String> sets) {
        System.out.println(sets);
    }

}

