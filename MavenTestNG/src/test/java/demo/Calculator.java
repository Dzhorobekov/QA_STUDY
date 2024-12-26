package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator extends  TestNgAnnotations2{

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Divide be zero is not allowed");
        }
        return a / b;
    }

    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
                              // actual result ,       // expected
        Assert.assertEquals(calculator.add(1,2),3);
        Assert.assertEquals(calculator.add(100,200),300.0);
    }


    @Test(groups = "UI")
    void testSubtract(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(5,2),3);
        System.out.println("hello world!123");
    }


    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5,2),10);
    }


    @Test
    void testDivide(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(5,5),1);
        Assert.assertThrows(ArithmeticException.class, () -> {
            throw new ArithmeticException("\"Divide be zero is not allowed\"");});
        }
    }



