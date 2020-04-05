package Gek;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Geek {
    public static void main(String[] args) {

        // Create an Immutable List
//        List<String> lt = Stream.of("GEEKS", "For", "GEEKS").collect(Collectors.collectingAndThen(Collectors.toList(),
//                Collections::<String> unmodifiableList));
//
//        System.out.println(lt.getClass().getName());

//        // Create an Immutable Set
//        Set<String> st
//                = Stream
//                .of("GEEKS", "FOR", "GEEKS")
//                .collect(
//                        Collectors
//                                .collectingAndThen(Collectors.toSet(),
//                                        Collections::<String>
//                                                unmodifiableSet));
//        System.out.println(st);

//        // Create an Immutable Map
//        Map<String, String> mp
//                = Stream
//                .of(new String[][] {
//                        { "1", "Geeks" },
//                        { "2", "For" },
//                        { "3", "Geeks" } })
//                .collect(
//                        Collectors
//                                .collectingAndThen(
//                                        Collectors.toMap(p -> p[0], p -> p[1]),
//                                        Collections::<String, String>
//                                                unmodifiableMap));
//        System.out.println(mp);



//        // creating a string stream with numbers
//        Stream<String> s = Stream.of("3", "4", "5");
//
//        // using Collectors averagingInt(ToIntFunction mapper)
//        // method to find arithmetic mean of inputs given
//        double ans = s.collect(Collectors.averagingInt(num->Integer.parseInt(num)));
//
//        // displaying the result
//        System.out.println(ans);


//        // creating a string stream
//        Stream<String> s = Stream.of("7", "8", "9", "10");
//
//        // using Collectors averagingInt(ToIntFunction mapper)
//        // method to find arithmetic mean of inputs given
//        double ans = s
//                .collect(Collectors
//                        .averagingInt(
//                                num -> Integer.parseInt(num)));
//
//        // displaying the result
//        System.out.println(ans);


//        // Function which takes in a number and
//        // returns half of it
//        Function<Integer,Double> half = a->a/2.0;
//
//        // However treble the value given to half function
//        half = half.compose(a->a*3);
//
//        // apply the function to get the result
//        System.out.println(half.apply(5));

        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        try {

            // try to pass null as parameter
            half = half.compose(null);
        }
        catch (Exception e) {
            System.out.println("Exception thrown "
                    + "while passing null: " + e);
        }

        // Function which takes in a number and
        // returns it
        Function i = Function.identity();

        System.out.println(i);

        // create a list of strings
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s)->s.startsWith("G");

        // Iterate through the list
        for (String st:names)
        {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }



    }
}
