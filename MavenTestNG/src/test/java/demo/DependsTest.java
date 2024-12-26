package demo;

import org.testng.annotations.Test;

public class DependsTest {

    @Test
    public void registrationTest() {
        System.out.println("Registration was successful!");
    }

    @Test(dependsOnMethods = {"registrationTest"})
    public void bookVilaTest() {
        System.out.println("Hello World!2");
    }
}
