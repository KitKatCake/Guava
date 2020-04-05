package Ex;


public class Parent extends Grandparent{
    Parent(){
        System.out.println("Parent class's No " +
                "argument constructor");
    }
    Parent(int a)
    {
        System.out.println("Parent class's 1 argument" +
                " constructor");
    }
    public void Print(){
        super.Print();
        System.out.println("Parent's Print()");
    }
}
