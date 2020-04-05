package Ex;

public class Derived extends Base1{
//    int y;
//    Derived(int _x,int _y){
//        super(_x);
//        y = _y;
//    }
//    void Display() {
//        System.out.println("x = "+x+", y = "+y);
//    }

    Derived() {
        System.out.println("Derived Class Constructor Called ");
    }

    public static void main(String[] args) {

        Derived d = new Derived();
//        Derived d = new Derived(10, 20);
//        d.Display();
    }

}
