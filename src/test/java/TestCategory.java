import jdk.jfr.Category;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(Feature1.class)
@Categories.ExcludeCategory(Feature2.class)
@Suite.SuiteClasses({TestAA.class,})
public class TestCategory {

}
