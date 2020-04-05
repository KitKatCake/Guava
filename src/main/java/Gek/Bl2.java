package Gek;

import java.util.function.BiFunction;

public class Bl2 {
    public static void main(String[] args) {
        // BiFunction which finds the sum of 2 integers
        // and returns twice their sum
        BiFunction<Integer, Integer, Integer> composite = (a, b) -> a + b;

        // Using addThen() method
//        composite = composite.andThen(a -> a / (a - 5));
        composite = composite.andThen(null);

        try {
            // Printing the result using apply()
            System.out.println("Composite = " + composite.apply(2, 3));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
