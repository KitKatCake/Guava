package Gek;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        SortedSet<String> sites = new TreeSet<>();
//        sites.add("practice");
//        sites.add("geeksforgeeks");
//        sites.add("quiz");
//        sites.add("code");
//
//        System.out.println("Sorted Set: " + sites);
//        System.out.println("First: " + sites.first());
//        System.out.println("Last: " + sites.last());
//
//        // Getting elements before quiz (Excluding) in a sortedSet
//        SortedSet<String> beforeQuiz = sites.headSet("quiz");
//        System.out.println(beforeQuiz);
//
//        // Getting elements between code (Including) and
//        // practice (Excluding)
//        SortedSet<String> betweenCodeAndQuiz =
//                sites.subSet("code","practice");
//        System.out.println(betweenCodeAndQuiz);



//        // Create a list of strings
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Geeks For Geeks");
//        al.add("Friends");
//        al.add("Dear");
//        al.add("Is");
//        al.add("Superb");
//
//        /* Collections.sort method is sorting the
//        elements of ArrayList in ascending order. */
////        Collections.sort(al);
//        Collections.sort(al,Collections.reverseOrder());
//
//        // Let us print the sorted list
//        System.out.println("List after the use of" +
//                " Collection.sort() :\n" + al);


//        // create an array of string objs
//        String domains[] = {"Practice", "Geeks",
//                "Code", "Quiz"};
//
//        // Here we are making a list named as Collist
//        List colList =
//                new ArrayList(Arrays.asList(domains));
//
//        // Collection.sort() method is used here
//        // to sort the list elements.
//        Collections.sort(colList);
//
//        // Let us print the sorted list
//        System.out.println("List after the use of" +
//                " Collection.sort()  :\n" +
//                colList);


//        // Let us create a list with 4 items
//        ArrayList<String> list =
//                new ArrayList<String>();
//        list.add("code");
//        list.add("code");
//        list.add("quiz");
//        list.add("code");
//
//        // count the frequency of the word "code"
//        System.out.println("The frequency of the word code is: "+
//                Collections.frequency(list, "code"));



        // Let us create a list of Student type
        ArrayList<Student2> list =
                new ArrayList<Student2>();
        list.add(new Student2("Ram", 19));
        list.add(new Student2("Ashok", 20));
        list.add(new Student2("Ram", 19));
        list.add(new Student2("Ashok", 19));

        // count the frequency of the word "code"
        System.out.println("The frequency of the Student Ram, 19 is: "+
                Collections.frequency(list, new Student2("Ram", 19)));

    }

}
