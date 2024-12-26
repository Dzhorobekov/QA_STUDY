package demo;

import org.testng.annotations.BeforeSuite;

public class TestNgAnnotations2 {


    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before suit");
    }
}
