package Bounded;

import java.util.*;

public class GFG1 {
    public static void main(String[] args) throws Exception{
        try{
//            // creating object of List<Integer>
//            List<Integer> arrlist = new ArrayList<>();
//
//            // Adding elemnet to srclst
//            arrlist.add(20);
//            arrlist.add(30);
//            arrlist.add(40);
//
//            // Print the list
//            System.out.println("List: " + arrlist);
//
//            // creating object of type Enumeration<Integer>
//            Enumeration<Integer> e = Collections.enumeration(arrlist);
//
//            // Print the Enumeration
//            System.out.println("\nEnumeration over list: ");
//
//            // print the enumeration
//            while (e.hasMoreElements())
//                System.out.println("Value is: " + e.nextElement());


//            // creating object of LinkedList
//            List<Integer> list = new LinkedList<Integer>();
//
//            // Adding element to Vector v
//            list.add(-1);
//            list.add(4);
//            list.add(-5);
//            list.add(1);
//
//            // prining the max value
//            // using max() method
//            System.out.println("Max value is: "
//                    + Collections.max(list));


//            // creating object of LinkedList
//            List<String> list = new LinkedList<String>();
//
//            // creating variable of object type
//            Object i = Integer.valueOf(42);
//
//            // Adding element to Vector v
//            list.add("Hello");
//            list.add((String)i);
//
//            // prining the max value
//            // using max() method
//            System.out.println("Max value is: "
//                    + Collections.max(list));


//            // creating object of LinkedList
//            List<Integer> list = new LinkedList<Integer>();
//
//            // prining the max value
//            // using max() method
//            System.out.println("Trying to get "
//                    + "the max from empty list");
//            System.out.println("Max value is: "
//                    + Collections.max(list));


            // creating object of LinkedList
            List<Integer> list = new LinkedList<Integer>();

            // Adding element to Vector v
            list.add(-1);
            list.add(4);
            list.add(-5);
            list.add(1);

            // prining the max value
            // using max() method
            System.out.println("Max val: "
                    + Collections.max(list,
                    Collections.reverseOrder()));


        }catch (ClassCastException e){
            System.out.println("Exception thrown : " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown : " + e);
        }

    }
}
