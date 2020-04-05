package Cls;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author 12705
 */
public class DemoTest {
    @Ignore
    @Test
    public void test() {
//        String str = "abc";
//        String str1 = "abc";
//        String str2 = new String("abc");
//
//        System.out.println(str == str1); //true
//
//        System.out.println(str == str2); //false

        String str1 = "str";
        String str2 = "ing";

        String str3 = "str" + "ing";
        String str4 = str1 + str2;

        System.out.println(str3 == str4);

        String str5 = "string";

        System.out.println(str3 == str5);
    }

    public static final String A = "ab";
    public static final String B = "cd";

    @Test
    public void test2(){
        String s = A + B;
        String t = "abcd";
        if (s == t){
            System.out.println("s等于t，它们是同一个对象");
        }else {
            System.out.println("s不等于t，它们不是同一个对象");
        }
    }
}
