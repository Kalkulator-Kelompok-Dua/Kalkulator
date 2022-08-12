package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @Before
    public void openWebBrowser(){

        System.setProperty("webdriver.chrome.driver", "D:\\Aplikasi\\Web Driver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://greyli.github.io/calculator/");
    }

    @After
    public void closeWebBrowser(){
        driver.quit();
    }
}