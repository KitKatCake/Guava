package Ex;

public class Geeks2 {
    public static void main(String[] args) {
//        Integer obj = new Integer(8);
//
//        //It will return a string representation
//        String stringvalue1 = obj.toString();
//        System.out.println("String Value= " +
//                stringvalue1);
//
//
//        Integer obj3 = new Integer(10);
//
//        //It will return a string representation
//        String stringvalue3 = obj3.toString();
//        System.out.println("String Value = " +
//                stringvalue3);

        Integer obj = new Integer(8);

        // It will return a string representation
        // in base 8
        String stringvalue1 = obj.toString(75);
        System.out.println("String Value = " +
                stringvalue1);

        Integer obj2 = new Integer(8);

        // It will return a string representation
        // in base 2
        String stringvalue2 = obj2.toString(6787);
        System.out.println("String Value = " +
                stringvalue2);


        Integer obj3 = new Integer(10);

        // It will return a string representation
        // in base 10
        String stringvalue3 = obj3.toString(-787);
        System.out.println("String Value = " +
                stringvalue3);
    }
}
