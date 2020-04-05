package Ex;

public class Child extends Parent {
    public void Print() {
        super.Print();  // Trying to access Grandparent's Print()
        System.out.println("Child's Print()");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.Print();

    }
}
