import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EvenNumberCheckerTest {
    private int inputNumber;
    private boolean isEven;

    public EvenNumberCheckerTest(int inputNumber,boolean isEven){
        super();
        this.inputNumber = inputNumber;
        this.isEven = isEven;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{
                {2,true},
                {5,false},
                {10,false}

        };
        return Arrays.asList(data);
    }
    @Test
    public void test(){
        System.out.println("inputNumber: " + inputNumber + "; isEven: " + isEven);
        EvenNumberChecker evenNumberChecker = new EvenNumberChecker();

        boolean actualResult = evenNumberChecker.isEven(inputNumber);
        Assert.assertEquals(isEven,actualResult);
    }

}
