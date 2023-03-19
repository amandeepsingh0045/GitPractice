package com.pepejeans;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {

    public WebDriver driver = null;

    @Test
    public void invokeBrowser() {

            /*    System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver();

             */

                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver.exe");
                driver = new FirefoxDriver();

            driver.get("https://www.pepejeans.in");
            driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            String title =driver.getTitle();
            System.out.println(title);
            driver.quit();

    }
    }


