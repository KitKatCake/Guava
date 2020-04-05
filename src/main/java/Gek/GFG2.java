package Gek;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GFG2 {
    public static void main(String[] args) {
//        List al = new ArrayList();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        al.add(10);
//        al.add(20);
//
//        // 10 is present at index 3.
//        int index = Collections.binarySearch(al, 10);
//        System.out.println(index);
//
//        // 13 is not present. 13 would have been inserted
//        // at position 4. So the function returns (-4-1)
//        // which is -5.
//        index = Collections.binarySearch(al, 13);
//        System.out.println(index);


//        // Let us create a list of strings
//        List<String>  mylist = new ArrayList<String>();
//        mylist.add("practice");
//        mylist.add("code");
//        mylist.add("quiz");
//        mylist.add("geeksforgeeks");
//
//        System.out.println("Original List : " + mylist);
//
//        // Here we are using rotate() method
//        // to rotate the element by distance 2
//        Collections.rotate(mylist,2);
//
//        System.out.println("Rotated List: " + mylist);

//        // Let us create an array of integers
//        Integer arr[] = {10, 20, 30, 40, 50};
//
//        System.out.println("Original Array : " +
//                Arrays.toString(arr));
//
//        // Please refer below post for details of asList()
//        // https://www.geeksforgeeks.org/array-class-in-java/
//        // rotating an array by distance 2
//        Collections.rotate(Arrays.asList(arr),3);
//
//        System.out.println("Modified Array : " +
//                Arrays.toString(arr));


        List<Integer> number = Arrays.asList(2, 3, 4, 5);

//        List<Integer> square =  number.stream().map(x -> x*x).
//                collect(Collectors.toList());
        number.stream().map(x -> x * x).
                collect(Collectors.toList()).forEach(System.out::println);

        //System.out.println(square);

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).
                collect(Collectors.toList());

        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

// demonstration of reduce method
        int even = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println(even);

        // Creating a string stream
        Stream<String> s = Stream.of("Geeks", "for", "GeeksClasses");

        // Using toCollection() method
        // to create a collection
        Collection<String> name_s = s.collect(Collectors.toCollection(TreeSet::new));

        // Printing the elements
        System.out.println(name_s);

        // Creating a string stream
        Stream<String> ss = Stream.of("2.5", "6", "4");

        // Using Collectors toCollection()
        Collection<String> name_ss = ss
                .collect(Collectors
                        .toCollection(TreeSet::new));

        // Printing the elements
        System.out.println(name_ss);
    }
}
