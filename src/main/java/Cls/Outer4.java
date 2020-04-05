package Cls;

public class Outer4 {
    public void func(){
        System.out.println("1");
    }

    public static void main(String[] args) {
        Outer4 inner = new Outer4(){
            @Override
            public void func() {
                System.out.println("2");
            }
        };
        inner.func();
    }
}
