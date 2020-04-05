package Cls;

/**
 * @author 12705
 * @param
 * @version 1.11
 */
public class StaticInnerClass {
    private int numA = 1;

    private static int numB = 2;

    static class Inner{
        private int numC = 3;
        private static int numD = 4;

        public void printInner(){
            System.out.println("printInner");
            System.out.println(numB);
            System.out.println(numC);
            System.out.println(numD);
        }
    }
    public void printOuter(){

        System.out.println("printOuter");

    }

    public static void main(String[] args) {
        StaticInnerClass outer = new StaticInnerClass();

        outer.printOuter();

        Inner inner = new StaticInnerClass.Inner();

        inner.printInner();

        System.out.println(StaticInnerClass.numB);

        System.out.println(inner.numD);
    }

}
