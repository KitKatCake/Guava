package Ex;

public class Geeks {
    public static void main(String[] args) {
        Integer obj = new Integer(10);

//        System.out.println("Output Value = "+obj.valueOf(85));

        String str = "424";
        // It will return  a Integer instance
        // representing  the specified string
        System.out.println("Integer Value = " +
                obj.valueOf(str));

        System.out.println("Output Value = " +
                obj.valueOf(-9185));
    }
}
