package Bounded;

public class BoundedClass {
    public static void main(String[] args) {
        //Creating object of sub class A and
        //passing it to Bound as a type parameter.
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();
    }
}
