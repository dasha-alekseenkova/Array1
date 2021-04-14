import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class ArrayTest {


    Comparator comp = new Comparator();

    @Test
    public void test1() {
        int result = comp.compare(2, 2);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result, 0);
    }
    @Test
    public void test2() {
        Array array = new Array();
        int expected[] = new int []{7,4,2};
        Assert.assertEquals(expected,array.sort(new int[]{2,4,7}, comp));
    }

    @Test
    public void test3() throws Exception {
        System.out.println("ArrayTest");
        Assert.assertTrue("my test", true);
    }
}

