package org.example;

import org.openqa.selenium.WebDriver;

class Helper {
    protected WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }
}