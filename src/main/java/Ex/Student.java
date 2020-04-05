package Ex;

public class Student extends Person {
    void message()
    {
        System.out.println("This is student class");
    }

    void display()
    {
        // will invoke or call current class message() method
        message();

        // will invoke or call parent class message() method
        super.message();
    }

    Student()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}
