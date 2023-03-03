package com.bridgelabz;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class FacebookLogin extends BaseClass {
    @Test
    public void login() throws IOException, InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("testingtestdatablz@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("pass")).sendKeys("testing123");
        Thread.sleep(500);
        driver.findElement(By.name("login")).click();
        Thread.sleep(500);
    }

}
