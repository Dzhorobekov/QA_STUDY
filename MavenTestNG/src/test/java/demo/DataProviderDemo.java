package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    FakeFactory fakeFactory = new FakeFactory();

    @DataProvider(name = "user credentials")
    public Object[][] userCredentials() {
        return new Object[][]{
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword(),},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword(),},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword(),},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword(),},
                {fakeFactory.generateFakeName(), fakeFactory.generateFakePassword(),},

        };
    }

    @Test(dataProvider = "user credentials")
    public void testLogin(String username, String password) {
        System.out.println("Input username and password " + username + " " + password);
    }


    @Test
    public void manualTestLogin1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("username -> " + fakeFactory.generateFakeName() + " password -> " + fakeFactory.generateFakePassword());
        }
    }
}


