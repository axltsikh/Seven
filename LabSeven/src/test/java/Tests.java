import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void Sum_2and6_Test(){
        double a = 2.0;
        double b = 6.0;
        char operation = '+';
        double waitedResult = 8.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Sum_435and32_Test(){
        double a = 435.0;
        double b = 32.0;
        char operation = '+';
        double waitedResult = 467.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Difference_5and6_Test(){
        double a = 5.0;
        double b = 6.0;
        char operation = '-';
        double waitedResult = -1.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Difference_11andMinus11_Test(){
        double a = 10.0;
        double b = -10.0;
        char operation = '-';
        double waitedResult = 20.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Multiply_12and12_Test(){
        double a = 12.0;
        double b = 12.0;
        char operation = '*';
        double waitedResult = 144.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Multiply_99and99_Test(){
        double a = 99.0;
        double b = 99.0;
        char operation = '*';
        double waitedResult = 9801.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Divide_3and5_Test(){
        double a = 3.0;
        double b = 5.0;
        char operation = '/';
        double waitedResult = 0.6;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Divide_100and5_Test(){
        double a = 100.0;
        double b = 5.0;
        char operation = '/';
        double waitedResult = 20.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Mod_52And5_Test(){
        double a = 52.0;
        double b = 5.0;
        char operation = '%';
        double waitedResult = 2.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Mod_100and100_Test(){
        double a = 100.0;
        double b = 100.0;
        char operation = '%';
        double waitedResult = 0.0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult, 0);
    }

    @Test
    public void InvalidOperationTest(){
        double a = 14;
        double b = 77;
        char operation = '@';
        double waitedResult = 0;
        Assert.assertEquals(Calculator.operation(a, b, operation), waitedResult,0);
    }
    @Test
    public void PlusTest(){
        Assert.assertEquals(5,Calculator.operation(3,2,'+'),0);
    }
    @Test
    public void MinusTest(){
        Assert.assertEquals(-1,Calculator.operation(2,3,'-'),0);
    }
    @Test
    public void MultiplicationTest(){
        Assert.assertEquals(150,Calculator.operation(15,10,'*'),0);
    }
    @Test
    public void DivisionTest(){
        Assert.assertEquals(5,Calculator.operation(25,5,'/'),0);
    }
//    @Test
//    public void DivisionByZeroTest(){
//        Calculator.operation(25,0,'/');
//    }
//    @Test
//    public void WrongOperationTest(){
//        Assert.assertEquals(5,Calculator.operation(25,5,'%'),0);
//    }

    @Test
    public void FirstSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(15,10,6));
    }
//    @Test
//    public void SecondSidesTest(){
//        Assert.assertTrue(Triangle.checkTriangle(0,0,0));
//    }
//    @Test
//    public void ThirdSidesTest(){
//        Assert.assertTrue(Triangle.checkTriangle(31,31,31));
//    }
//    @Test
//    public void FourthSidesTest(){
//        Assert.assertTrue(Triangle.checkTriangle(6,8,10));
//    }
//    @Test
//    public void FifthSidesTest(){
//        Assert.assertTrue(Triangle.checkTriangle(6,8,10));
//    }
//    @Test
//    public void SixthSidesTest(){
//        Assert.assertTrue(Triangle.checkTriangle(-96,25,-123));
//    }
//    @Test
//    public void NegativeSidesTest(){
//        Assert.assertTrue(Triangle.checkTriangle(-15,10,6));
//    }
    @Test
    public void ClassesTest(){
        Calculator calc=new Calculator();
        Triangle tr=new Triangle();

    }
    @Test
    public void Test1(){
        double a = 10.0;
        double b = 4.0;
        double c = 5.0;
        Assert.assertFalse(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test2(){
        double a = 4.0;
        double b = 5.0;
        double c = 6.0;
        Assert.assertTrue(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test3(){
        double a = 100.0;
        double b = 1.0;
        double c = 1.0;
        Assert.assertFalse(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test4(){
        double a = 4;
        double b = 3;
        double c = 5;
        Assert.assertTrue(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test5(){
        double a = 16.4;
        double b = 21.8;
        double c = 9.99;
        Assert.assertTrue(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test6(){
        double a = -196.4;
        double b = -211.8;
        double c = 1009.99;
        Assert.assertFalse(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test7(){
        double a = 1;
        double b = 1;
        double c = 1;
        Assert.assertTrue(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test8(){
        double a = 0;
        double b = 0;
        double c = 0;
        Assert.assertFalse(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test9(){
        double a = 31;
        double b = 31;
        double c = 31;
        Assert.assertTrue(Triangle.checkTriangle(a,b,c));
    }

    @Test
    public void Test10(){
        double a = 6;
        double b = 8;
        double c = 10;
        Assert.assertTrue(Triangle.checkTriangle(a,b,c));
    }

}
