package Th;

public class A extends Thread{
    private String name;
    int count = 0;
    public A(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void run(){
        count = 1;
        System.out.println(count);
    }
}
