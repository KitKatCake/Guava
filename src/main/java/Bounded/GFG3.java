package Bounded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class GFG3 {
    public static void main(String[] args) {
        try{
//            // creating object of List<Integer>
//            List<String> arrlist = new ArrayList<String>();
//
//            // Adding element to srclst
//            arrlist.add("A");
//            arrlist.add("B");
//            arrlist.add("C");
//
//            // print the elements
//            System.out.println("List elements before fill: "
//                    + arrlist);
//
//            // fill the list
//            Collections.fill(arrlist, "TAJMAHAL");
//
//            // print the elements
//            System.out.println("\nList elements after fill: "
//                    + arrlist);



//            // creating object of List<Integer>
//            List<Integer> arrlist = new ArrayList<Integer>();
//
//            // Adding element to srclst
//            arrlist.add(20);
//            arrlist.add(30);
//            arrlist.add(40);
//
//            // print the elements
//            System.out.println("List elements before fill: "
//                    + arrlist);
//
//            // fill the list
//            Collections.fill(arrlist, 500);
//
//            // print the elements
//            System.out.println("\nList elements after fill: "
//                    + arrlist);

//            // creating object of Source list and destination List
//            List<String> srclst = new ArrayList<String>(3);
//            List<String> destlst = new ArrayList<String>(3);
//
//            // Adding element to srclst
//            srclst.add("Ram");
//            srclst.add("Gopal");
//            srclst.add("Verma");
//
//            // Adding element to destlst
//            destlst.add("1");
//            destlst.add("2");
//            destlst.add("3");
//
//
//            // printing the srclst
//            System.out.println("Value of source list: " + srclst);
//
//            // printing the destlst
//            System.out.println("Value of destination list: " + destlst);
//
//            System.out.println("\nAfter copying:\n");
//
//            // copy element into destlst
//            Collections.copy(destlst, srclst);
//
//            // printing the srclst
//            System.out.println("Value of source list: " + srclst);
//
//            // printing the destlst
//            System.out.println("Value of destination list: " + destlst);



            // creating object of Source list and destination List
            List<String> srclst = new ArrayList<String>(3);
            List<String> destlst = new ArrayList<String>(2);

            // Adding element to srclst
            srclst.add("Ram");
            srclst.add("Gopal");
            srclst.add("Verma");

            // Adding element to destlst
            destlst.add("1");
            destlst.add("2");

            // printing the srclst
            System.out.println("Value of source list: " + srclst);

            // printing the destlst
            System.out.println("Value of destination list: " + destlst);

            System.out.println("\nAfter copying:\n");

            // copy element into destlst
            Collections.copy(destlst, srclst);

            // printing the srclst
            System.out.println("Value of source list: " + srclst);

            // printing the destlst
            System.out.println("Value of destination list: " + destlst);
        }catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
        catch (NoSuchElementException e) {
            System.out.println("Exception thrown : " + e);
        }

    }
}
