package Gek;

import java.util.*;

public class GFG {
//    static {
//        System.out.println("This is static Block called!");
//    }
//    // Initializer block starts..
//    {
//        // This code is executed before every constructor.
//        System.out.println("Common part of constructors invoked !!");
//    }
//    // Initializer block ends
//    public GFG()
//    {
//        System.out.println("Default Constructor invoked");
//    }
//    public GFG(int x)
//    {
//        System.out.println("Parametrized constructor invoked");
//    }
    public static void main(String arr[])
    {
//        GFG obj1, obj2;
//        obj1 = new GFG();
//        obj2 = new GFG(0);
//
//        GFG obj3 = new GFG(1);

        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
        mylist.add("quiz");
        mylist.add("practice");
        mylist.add("qa");

        System.out.println("Original List : \n" + mylist);

//        Collections.shuffle(mylist);
//
//        System.out.println("\nShuffled List : \n" + mylist);


        // Here we use Random() to shuffle given list.
        Collections.shuffle(mylist, new Random());
        System.out.println("\nShuffled List with Random() : \n"
                + mylist);

        // Here we use Random(3) to shuffle given list.
        Collections.shuffle(mylist, new Random(3));
        System.out.println("\nShuffled List with Random(3) : \n"
                + mylist);

        // Here we use Random(3) to shuffle given list.
        Collections.shuffle(mylist, new Random(5));
        System.out.println("\nShuffled List with Random(5) : \n"
                + mylist);



    }
}
