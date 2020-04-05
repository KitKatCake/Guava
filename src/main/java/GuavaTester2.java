import com.google.common.base.Joiner;

import java.util.Arrays;

public class GuavaTester2 {
    public static void main(String[] args) {
        GuavaTester2 tester2 = new GuavaTester2();
        tester2.testJoiner();

    }
    private void testJoiner(){
        System.out.println(Joiner.on(",")
                .skipNulls()
                .join(Arrays.asList(1,2,3,4,5,null,6)));
    }
}
