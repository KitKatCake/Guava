import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestTheories {
//    @DataPoint
//    public static String nameValue1 = "Tony";
//    @DataPoint
//    public static String nameValue2 = "Jim";
//    @DataPoint
//    public static int ageValue1 = 10;
//    @DataPoint
//    public static int ageValue2 = 20;

    @DataPoints
    public static String[] names = {"Tony", "Jim"};
    @DataPoints
    public static int[] ageValue1 = {10, 20};

    @Theory
    public void testMethod(String name,String age){
        System.out.println(String.format("%s's age is %s", name, age));
    }
}
