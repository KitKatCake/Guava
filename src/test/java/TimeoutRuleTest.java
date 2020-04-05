import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertNull;

public class TimeoutRuleTest {

    @Rule
    public Timeout timeout = new Timeout(1000);

//    @Test
//    public void testTimeout1() {
//        while(true);
//    }
//
//    @Test
//    public void testTimeout2() {
//        while(true);
//    }

    @Test
    public void testAssertNull() {
        String str = null;
        assertNull(str);
    }


}
