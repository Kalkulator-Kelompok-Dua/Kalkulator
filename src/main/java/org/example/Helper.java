package org.example;

import org.openqa.selenium.WebDriver;

public class Helper {
    protected WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }
}