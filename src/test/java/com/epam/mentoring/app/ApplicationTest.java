package com.epam.mentoring.app;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationTest {

    @Test
    public void testApplication() {
        Application application = new Application();
        int actual = application.giveOneInt();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

}
