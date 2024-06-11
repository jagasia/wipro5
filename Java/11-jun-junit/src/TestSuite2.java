import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({MathematicsTest.class,MathematicsTest2.class, MathematicsTest3.class, MathematicsTest4.class})
@IncludeCategory({User.class})
public class TestSuite2 {

}
