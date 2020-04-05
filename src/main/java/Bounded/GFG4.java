package Bounded;

import java.util.*;

public class GFG4 {
    public static void main(String[] args) {
        try {

//            // creating object of List<String>
//            List<String> arlst = new ArrayList<String>();
//
//            // Adding element to arlst
//            arlst.add("A");
//            arlst.add("B");
//            arlst.add("C");
//            arlst.add("TajMahal");
//
//            // printing the arrlist
//            System.out.println("List: " + arlst);
//
//            // create typesafe view of the specified list
//            List<String>
//                    tslst = Collections
//                    .checkedList(arlst, String.class);
//
//            // printing the arrlist after operation
//            System.out.println("Typesafe view of List: " + tslst);

//            // creating object of List<Integer>
//            List<Integer> arlst = new ArrayList<Integer>();
//
//            // Adding element to arlst
//            arlst.add(20);
//            arlst.add(30);
//            arlst.add(40);
//            arlst.add(50);
//
//            // printing the arrlist
//            System.out.println("List: " + arlst);
//
//            // create typesafe view of the specified list
//            List<Integer>
//                    tslst = Collections
//                    .checkedList(arlst, Integer.class);
//
//            // printing the arrlist after operation
//            System.out.println("Typesafe view of List: " + tslst);




//            // creating object of SortedSet<String>
//            SortedSet<String> set = new TreeSet<String>();
//
//            // populate the set
//            set.add("A");
//            set.add("B");
//            set.add("C");
//            set.add("D");
//
//            // printing the Collection
//            System.out.println("Sorted Set : " + set);
//
//            // create a synchronized sorted set
//            SortedSet<String>
//                    sorset = Collections
//                    .synchronizedSortedSet(set);
//
//            // printing the set
//            System.out.println("Sorted set is : "
//                    + sorset);





//            // creating object of SortedSet<String>
//            SortedSet<Integer>
//                    set = new TreeSet<Integer>();
//
//            // populate the set
//            set.add(10);
//            set.add(20);
//            set.add(30);
//            set.add(40);
//            set.add(5);
//
//            // printing the Collection
//            System.out.println("Sorted Set : " + set);
//
//            // create a synchronized sorted set
//            SortedSet<Integer>
//                    sorset = Collections
//                    .synchronizedSortedSet(set);
//
//            // printing the set
//            System.out.println("Sorted set is : "
//                    + sorset);







            // creating object of Deque<Integer>
            Deque<Integer> deque = new ArrayDeque<Integer>(7);

            // Adding element to deque
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            deque.add(5);

            System.out.println(deque.pop());
            System.out.println(deque.peek());
            System.out.println(deque.poll());


            // get queue from the deque
            // using asLifoQueue() method
            Queue<Integer> nq = Collections.asLifoQueue(deque);

            // printng the Queue
            System.out.println("View of the queue is: " + nq);

            System.out.println(nq.peek());
            System.out.println(nq.poll());





        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
