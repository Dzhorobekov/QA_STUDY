package demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBgAnnotations extends TestNgAnnotations2{
    @BeforeClass
    public void beforeClass1() {
        System.out.println("Before class");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");

    }
    @BeforeClass
    public void beforeMethod1() {
        System.out.println("Before class");
    }

}
