package Cls;


/**
 * @author 12705
 */
public class Outer {
    private String name;
    private int age;

    public Outer(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }
    public Outer(){

    }

    public static class Builder{
        private String name;
        private int age;
        public Builder(int age){
            this.age = age;
        }
        public Builder withName(String name){
            this.name = name;
            return this;
        }
        public Outer build(){
            return new Outer(this);
        }
    }
    public Outer getOuter(){
        Outer outer = new Outer.Builder(2).withName("Yang Liu").build();
        return outer;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();

        System.out.println(outer.getOuter());
    }
}
