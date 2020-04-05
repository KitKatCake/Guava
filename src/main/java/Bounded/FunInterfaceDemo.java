package Bounded;

public class FunInterfaceDemo {
    interface FuncInter1{
        int operation(int a,int b);
    }

    interface FuncInter2
    {
        void sayMessage(String message);
    }

    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;

        FunInterfaceDemo tobj = new FunInterfaceDemo();

        System.out.println("Addition is " +
                tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is " +
                tobj.operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        FuncInter2 fobj = message ->System.out.println("Hello "
                + message);
        fobj.sayMessage("Geek");
    }
}
