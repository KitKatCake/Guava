import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestA.class,TestB.class})
public class Jtest2 {
    @Ignore
    @Test
    public void testPrint(){
        System.out.println("This is test suite");
    }


}
