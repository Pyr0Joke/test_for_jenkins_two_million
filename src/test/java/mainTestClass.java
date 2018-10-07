
import org.testng.Assert;
import org.testng.annotations.Test;

public class mainTestClass {
    @Test
    public void test_good_add(){
        Assert.assertEquals(5, 2+3);
    }

    @Test
    public void test_bad_add(){
        Assert.assertEquals(5, 3+3);
    }
}
