package Cls;

public class Outer3 {
    private int num = 1;
    private int num1 = 10;

    public void func(){
        class Inner{
            private int num = 2;
        }
        Inner inner = new Inner();
        System.out.println(inner.num);
    }

    public static void main(String[] args) {
        //Outer3 out = new Outer3();

        //out.func();

        Inner2 inner2 = new Outer3.Inner2();


    }

     static class Inner2{

     }
}
