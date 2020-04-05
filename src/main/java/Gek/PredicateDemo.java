package Gek;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        // Creating predicate
//        Predicate<Integer> lessthan = i ->(i<18);
//
//        // Calling Predicate method
//        System.out.println(lessthan.test(10));


        // Creating predicate
        Predicate<Integer> greaterThanTen = (i)->i>10;

        Predicate<Integer> lowerThanTwenty = (i)->i<20;

        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);

        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
    }
}
