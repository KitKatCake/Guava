import org.junit.*;

import static org.junit.Assert.assertEquals;

public class JTest {
//    @Ignore
//    @Test
//    public void print(){
//        System.out.println("This is Method1");
//    }
//
//    @Test
//    public void print2(){
//        System.out.println("This is Method2");
//    }
//
//    @Test
//    public void print3(){
//        System.out.println("This is Method3");
//    }
//
//    @Test(expected = ArithmeticException.class)
//    public void testExpected() {
//        System.out.println("@Test(expected = Exception.class)");
//        throw new ArithmeticException();
//    }

    @Before
    public void before() {
        System.out.println("@Before");
    }

    @Test
    public void test() {
        System.out.println("@Test");
        assertEquals(5 + 5, 10);
    }

//    @Ignore
//    @Test
//    public void testIgnore() {
//        System.out.println("@Ignore");
//    }

    @Test(timeout = 50)
    public void testTimeout() {
        System.out.println("@Test(timeout = 50)");
        assertEquals(5 + 5, 10);
    }

    @After
    public void after() {
        System.out.println("@After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass");
    }
}
