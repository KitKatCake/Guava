package Gek;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterfaceExample3 {
    static void pred(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

    public static void main(String[] args) {
        pred(10, (i) -> i > 7);
//        pred(2,(i)->i>7);
        predicate_or();

        predicate_and();

        predicate_negate();
    }
    public static void predicate_negate()
    {

        String lengthGTThan10 = "Thunderstruck is a 2012 children's "
                + "film starring Kevin Durant";

        boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
        System.out.println(outcome);
    }

    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 10;
        }
    };

    public static void predicate_or() {
        Predicate<String> containsLetterA = p -> p.contains("A");

        String containsA = "And";

        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }

    public static void predicate_and(){
        Predicate<String> nonNullPredicate = Objects::nonNull;

        String nullString = null;

        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);

        System.out.println(outcome);

        String lengthGTThan10 = "Welcome to the machine";

        boolean outcome2 = nonNullPredicate.and(hasLengthOf10).
                test(lengthGTThan10);
        System.out.println(outcome2);
    }

}
