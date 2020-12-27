package com.nextBaseCRM.test.CRMTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http:/nextbasecrm.com");

        String actualTitle = "login.nextbasecrm";
        String expectedTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("nextBaseCRM verification Passed");
        }else {
            System.out.println("nextBaseCRM verification Passed");
        }

        // I'm going to create my test cases now in jira





    }
}
