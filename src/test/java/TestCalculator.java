import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testplus1()
    {
        int arg1 = 1;
        int agr2 = 1;
        int expectedResult = 2;
        //Act = Action
        int result = Calculator.add(arg1, agr2);

        //Assert = Verifier
        Assert.assertEquals(expectedResult, result);

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void  testMax()
    {
        int arg1 = Integer.MAX_VALUE;
        int agr2 = 1;
        int expectedResult = 2;
        //Act = Action
        int result = Calculator.add(arg1, agr2);

        //Assert = Verifier
       //S Assert.assertEquals(expectedResult, result);
    }
    public void  testMin()
    {
        int arg1 = Integer.MIN_VALUE;
        int agr2 = -1;
        int expectedResult = 2;
        //Act = Action
        int result = Calculator.add(arg1, agr2);

        //Assert = Verifier
        //S Assert.assertEquals(expectedResult, result);
    }
}
