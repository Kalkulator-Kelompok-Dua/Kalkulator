package org.example;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    WebDriverWait w;

    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");
        //lokasi web driver
        System.setProperty("webdriver.chrome.driver", "C:\\Risya\\chromedriver.exe");
        driver = new ChromeDriver();
        // Open web tujuan: Greyli Kalkulator
        driver.get("https://greyli.github.io/calculator/");
        driver.manage().window().maximize();
        w = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
}