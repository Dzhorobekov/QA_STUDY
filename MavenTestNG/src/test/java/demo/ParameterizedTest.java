package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {




    @Test
    @Parameters({"browser"})
    public void test1(@Optional("chrome") String browser){
        System.out.println("Running test " + browser + "with parameters ");
    }

}
