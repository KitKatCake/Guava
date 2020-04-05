package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GFG2 {
    public static void main(String[] args) {
        List<String> g = Arrays.asList("geeks","for","geeks");

        Map<String,Long> result = g.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result);

//        char[] ch = { 'G', 'e', 'e', 'k', 's',
//                'f', 'o', 'r',
//                'G', 'e', 'e', 'k', 's' };
//
//        String chString = Stream.of(ch).map(arr->new String(arr)).collect(Collectors.joining());
//
//        System.out.println(chString);


//        List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's',
//                'f', 'o', 'r',
//                'G', 'e', 'e', 'k', 's');
//
//        String chString = ch.stream().map(String::valueOf).collect(Collectors.joining());
//
//        System.out.println(chString);

        String chString = g.stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println(chString);


    }
}
