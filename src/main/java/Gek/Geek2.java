package Gek;

import java.util.ArrayDeque;
import java.util.function.Function;

public class Geek2 {
    public static void main(String[] args) {
//        // create an ArrayDeque
//        // containing a list of string values
//        ArrayDeque<String> students = new ArrayDeque<>();
//
//        // Add Strings to list
//        // each string represents student name
//        students.add("Aman");
//        students.add("Sanjeet");
//        students.add("Amar");
//        students.add("Rabi");
//        students.add("Shabbir");
//
//        // apply removeIf() method
//        // to remove names which start with A
//        students.removeIf(n->(n.charAt(0)=='A'));
//
//        System.out.println("Students name do not starts with A");
//
//        // print list
//        for (String str : students) {
//            System.out.println(str);
//        }


//        // create an ArrayDeque
//        // containing a list of Student objects
//        ArrayDeque<Student> students = new ArrayDeque<Student>();
//
//        // Add student object to list
//        students.add(new Student("Aman", 78));
//        students.add(new Student("Amar", 79));
//        students.add(new Student("Suraj", 38));
//        students.add(new Student("Raju", 22));
//        students.add(new Student("Ankit", 76));
//        students.add(new Student("Sanju", 62));
//
//        // apply removeIf() method
//        // to remove students who scores below 40
//        students.removeIf(n -> (n.marks <= 40));
//
//        System.out.println("Students list who score above 40");
//
//        // print list
//        for (Student str : students) {
//            System.out.println(str.name + ", " + str.marks);
//        }


//        // create an ArrayDeque
//        // containing a list of string values
//        ArrayDeque<String> students = new ArrayDeque<String>();
//
//        // Add Strings to list
//        // each string represents student name
//        students.add("Aman");
//        students.add("Sanjeet");
//        students.add("Amar");
//        students.add("Rabi");
//        students.add("Shabbir");
//
//        try {
//            // apply removeIf() method with null filter
//            students.removeIf(null);
//        }
//        catch (Exception e) {
//            System.out.println("Exception: " + e);
//           // e.printStackTrace();
//           // System.out.println(e.getMessage());
//        }


//        // Function which takes in a number
//        // and returns half of it
//        Function<Integer,Double> half = a->a/2.0;
//
//
//        // Now treble the output of half function
//        half = half.andThen(a->3*a);
//
//        // apply the function to get the result
//        System.out.println(half.apply(10));


//        // Function which takes in a number and
//        // returns half of it
//
//        Function<Integer, Double> half = a -> a / 2.0;
//
//        try {
//
//            // try to pass null as parameter
//            half = half.andThen(null);
//        }
//        catch (Exception e) {
//            System.out.println("Exception thrown "
//                    + "while passing null: " + e);
//        }

        int a = 5;

        // lambda expression to define the calculate method
        Square s = x->x*x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);

    }
}
