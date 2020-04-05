package Bounded;

import java.util.Enumeration;
import java.util.Vector;

public class Test {
    // A Generic method example
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+" = "+element);
    }

    public static void main(String[] args) {
        // Calling generic method
        // with Integer argument
        genericDisplay(11);

        // Calling generic method
        // with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method
        // with double argument
        genericDisplay(1.0);


        // create enumeration
        Enumeration Days;
        Vector week = new Vector();

        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        Days = week.elements();

        // get the iterator
        Days.asIterator()
                .forEachRemaining(s -> System.out.println(s));


        // create enumeration
        Enumeration<Integer> classNine;
        Vector<Integer> rollno
                = new Vector<Integer>();

        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        rollno.add(5);
        classNine = rollno.elements();

//        // get the iterator
//        classNine.asIterator()
//                .forEachRemaining(s -> System.out.println(s));

        while(classNine.hasMoreElements()){
            System.out.println(classNine.nextElement());
        }
    }
}
