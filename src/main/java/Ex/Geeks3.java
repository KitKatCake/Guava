package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Geeks3 {
    public static void main(String[] args) {
//        // Create a character list
//        List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's',
//                'f', 'o', 'r',
//                'G', 'e', 'e', 'k', 's');
//
//        // Convert the character list into String
//        // using Collectors.joining() method
//        // with, as the delimiter
//        String chString = ch.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
//
//        // Print the concatenated String
//        System.out.println(chString);

// Create a character list
//        List<String> str = Arrays.asList("Geeks", "for", "Geeks");
//
//        // Convert the character list into String
//        // using Collectors.joining() method
//        String chString = str.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", ", "{", "}"));
//
//        // Print the concatenated String
//        System.out.println(chString);




//        Stream<Integer> i = Stream.of(1,2,3,4,5,6);
//
//        long count_int = i.collect(Collectors.counting());
//
//        System.out.println(count_int);

        // creating stream of strings
        Stream<String> s = Stream.of("Akash","Harsh",
                "Shubham","Nishant","Pratik");

        // counting number of strings in stream
        long count_string =  s.collect(Collectors.counting());

        System.out.println(count_string);


    }
}
