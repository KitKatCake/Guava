package Th;

public class B extends Thread{
    private String name;
    public B(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println();
    }
}
