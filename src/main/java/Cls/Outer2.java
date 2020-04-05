package Cls;

public class Outer2 {
    private int num = 1;

    public class Inner{
        private int num = 2;
        private void func(){
            System.out.println(Outer2.this.num);
        }
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();

        //Inner inner = outer2.new Inner();

        //inner.func();

       // System.out.println(inner.num);

        outer2.func2();
    }
    public void func2(){
        Inner inner = new Inner();
        System.out.println(inner.num);
    }
}
