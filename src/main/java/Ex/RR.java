package Ex;

public class RR {
    RR(){
        this(10);
        System.out.println("Flow comes back from " +
                "RR class's 1 arg const");
    }
    RR(int a){
        System.out.println("RR class's 1 arg const");
    }

    public static void main(String[] args) {
        new RR();
        System.out.println("Inside Main");
    }
}

