package Bounded;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GFG2 {
    public static void main(String[] args) throws Exception{
        try {

//            // creating object of List<String>
//            List<String> vector = new ArrayList<String>();
//
//            // populate the vector
//            vector.add("A");
//            vector.add("B");
//            vector.add("C");
//            vector.add("D");
//            vector.add("E");
//
//            // pritning the vector before swap
//            System.out.println("Before swap: " + vector);
//
////            // swap the elements
////            System.out.println("\nSwapping 0th and 4th element.");
////            Collections.swap(vector, 0, 4);
//
//            // swap the elements
//            System.out.println("\nTrying to swap elements"
//                    + " more than upper bound index ");
//            Collections.swap(vector, 0, 5);
//
//
//            // priting the vector after swap
//            System.out.println("\nAfter swap: " + vector);


//            // creating object of List<String>
//            List<String> list = new ArrayList<String>();
//
//            // populate the list
//            list.add("A");
//            list.add("B");
//            list.add("C");
//            list.add("D");
//            list.add("E");
//
//            // printing the Collection
//            System.out.println("List : " + list);
//
//            // create a synchronized list
//            List<String> synlist = Collections
//                    .synchronizedList(list);
//
//            // printing the Collection
//            System.out.println("Synchronized list is : " + synlist);

            // creating object of List<Integer>
            List<Integer> list = new ArrayList<Integer>();

            // populate the list
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);

            // printing the Collection
            System.out.println("List : " + list);

            // create a synchronized list
            List<Integer> synlist = Collections
                    .synchronizedList(list);

            // printing the Collection
            System.out.println("Synchronized list is : " + synlist);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }

    }
}
