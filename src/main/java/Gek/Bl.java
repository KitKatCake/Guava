package Gek;

import java.util.function.BiFunction;

public class Bl {
    public static void main(String[] args) {
        // BiFunction to add 2 numbers
        BiFunction<Integer,Integer,Integer> add = (a,b)->a+b;

        // Implement add using apply()
        System.out.println("Sum = " + add.apply(2, 3));
        // BiFunction to multiply 2 numbers
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Implement add using apply()
        System.out.println("Product = " + multiply.apply(2, 3));


        BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b;

        composite1 = composite1.andThen(a -> 2 * a);

        System.out.println("Composite1 = " + composite1.apply(2, 3));

        BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b;

        // Using addThen() method
        composite2 = composite2.andThen(a -> 3 * a);

        // Printing the result
        System.out.println("Composite2 = " + composite2.apply(2, 3));
    }
}
