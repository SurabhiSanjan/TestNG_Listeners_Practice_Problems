package com.bridgelabz;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class Webinar extends BaseClass {
    @Test(description = "To use dataprovider for autofilling multiple data", priority = 0, dataProvider = "DataProvider", dataProviderClass = WebinarDataProviders.class)
    @Parameters
    public void webinarAutoFill(String phoneNo, String emailId) throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        driver.findElement(By.name("ContactNumber")).sendKeys(phoneNo);
        Thread.sleep(500);
        driver.findElement(By.id("deftemail")).sendKeys(emailId);
        Thread.sleep(500);
    }

    @Test(dataProvider = "DataProvider", dataProviderClass = WebinarDataProviders.class)
    public void email(String emailID) throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        driver.findElement(By.id("deftemail")).sendKeys(emailID);
        Thread.sleep(500);
    }

}

