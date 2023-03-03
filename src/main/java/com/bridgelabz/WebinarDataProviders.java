package com.bridgelabz;
import org.testng.annotations.DataProvider;
import java.lang.reflect.Method;

public class WebinarDataProviders {
    @DataProvider(name = "DataProvider")
    public static Object[][] getDataForWebinar(Method m) {
        if (m.getName().equalsIgnoreCase("webinarAutoFill")) {
            return new Object[][]{
                    {"8544370256", "abc@gmail.com"},
                    {"7586952365", "fgj@gmail.com"},
                    {"9865362569", "hkj@gmail.com"}
            };
        } else {
            return new Object[][]{
                    {"abc@gmail.com"},
                    {"nmjf@gmail.com"},
                    {"hghhg@gmail.com"}
            };
        }
    }
}
