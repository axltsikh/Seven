import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void ClassTest(){
        Calculator calc=new Calculator();
        Triangle triangle=new Triangle();
    }
    @Test
    public void FirstCalc(){
        Assert.assertEquals(Calculator.operation(2.0, 6.0, '+'), 8.0, 0);
    }

    @Test
    public void SecondCalc(){
        Assert.assertEquals(Calculator.operation(435.0, 32.0, '+'), 467.0, 0);
    }

    @Test
    public void ThirdCalc(){
        Assert.assertEquals(Calculator.operation(5.0, 6.0, '-'), -1.0, 0);
    }

    @Test
    public void FourthCalc(){
        Assert.assertEquals(Calculator.operation(10.0, -10.0, '-'), 20.0, 0);
    }

    @Test
    public void FifthCalc(){
        Assert.assertEquals(Calculator.operation(12.0, 12.0, '*'), 144.0, 0);
    }

    @Test
    public void SixthCalc(){
        Assert.assertEquals(Calculator.operation(99.0, 99.0, '*'), 9801.0, 0);
    }

    @Test
    public void SeventhCalc(){
        Assert.assertEquals(Calculator.operation(3.0, 5.0, '/'), 0.6, 0);
    }

    @Test
    public void EightCalc(){
        Assert.assertEquals(Calculator.operation(100.0, 5.0, '/'), 20.0, 0);
    }

    @Test
    public void NineCalc(){
        Assert.assertEquals(Calculator.operation(52.0, 5.0, '%'), 2.0, 0);
    }

    @Test
    public void TenCalc(){
        Assert.assertEquals(Calculator.operation(100.0,100.0, '%'), 0.0, 0);
    }

    @Test
    public void ElevenCalc(){
        Assert.assertEquals(Calculator.operation(14, 77, '@'), 0,0);
    }
    @Test
    public void Test1(){
        Assert.assertFalse(Triangle.checkTriangle(10.0,4.0,5.0));
    }

    @Test
    public void Test2(){
        Assert.assertTrue(Triangle.checkTriangle(4.0,5.0,6.0));
    }

    @Test
    public void Test3(){
        Assert.assertFalse(Triangle.checkTriangle(100.0,1.0,1.0));
    }

    @Test
    public void Test4(){
        Assert.assertTrue(Triangle.checkTriangle(4,3,5));
    }

    @Test
    public void Test5(){
        double a = 16.4;
        double b = 21.8;
        double c = 9.99;
        Assert.assertTrue(Triangle.checkTriangle(16.4,21.8,9.99));
    }

    @Test
    public void Test6(){
        Assert.assertFalse(Triangle.checkTriangle(-196.4,-211.8,1009.99));
    }

    @Test
    public void Test7(){
        Assert.assertTrue(Triangle.checkTriangle(1,1,1));
    }

    @Test
    public void Test8(){
        Assert.assertFalse(Triangle.checkTriangle(0,0,0));
    }

    @Test
    public void Test9(){
        Assert.assertTrue(Triangle.checkTriangle(31,31,31));
    }

    @Test
    public void Test10(){
        Assert.assertTrue(Triangle.checkTriangle(6,8,10));
    }

}
