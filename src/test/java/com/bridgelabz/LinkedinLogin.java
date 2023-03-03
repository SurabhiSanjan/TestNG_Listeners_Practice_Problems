package com.bridgelabz;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class LinkedinLogin extends BaseClass {
    @Test(description = "To login into linked with valid user credentials", priority=0 )
    public void login() throws IOException, InterruptedException {
        driver.navigate().to("https://www.linkedin.com/");
        driver.findElement(By.id("session_key")).sendKeys("8544370256");
        Thread.sleep(500);
        driver.findElement(By.id("session_password")).sendKeys("Theend@1");
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/form[1]/div[2]/button")).click();
        Thread.sleep(2000);
    }

    @Test(description = "To sign out from already signed in linkedIn ID", priority = 1, dependsOnMethods = {"login"})
    public void signOut() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ember18\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.linkText("Sign Out")).click();
        Thread.sleep(1000);
    }
}
