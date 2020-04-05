package Ex;

public class Base extends Parent {
    Base()
    {
        this(10);
        // By default compiler put super()
        // here and not super(int)
        System.out.println("Base class's No " +
                "argument constructor");
    }
    Base(int a)
    {
        this(10, 20);
        System.out.println("1 arg const");
    }
    Base(int k, int m)
    {
        // See here by default compiler put super();
        System.out.println("2 arg const");
    }
    public static void main(String[] args)
    {
        new Base();
        System.out.println("Inside Main");
    }
}
