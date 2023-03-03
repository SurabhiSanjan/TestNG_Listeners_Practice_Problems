package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReporterListener.class)
public class TestFailure extends BaseClass {
    @Test
    public void testPassed() {
        Assert.assertTrue(true);
    }

    @Test
    public void testFailed() {
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "testPassed")
    public void testDepend() {
        Assert.assertTrue(true);
    }
}
