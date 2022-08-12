package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject extends Helper{
    By buttonOne = By.xpath("//button[@value='1']");
    By buttonTwo = By.xpath("//button[@value='2']");
    By buttonThree = By.xpath("//button[@value='3']");
    By buttonFour = By.xpath("//button[@value='4']");
    By buttonFive = By.xpath("//button[@value='5']");
    By buttonSix = By.xpath("//button[@value='6']");
    By buttonSeven = By.xpath("//button[@value='7']");
    By buttonEight = By.xpath("//button[@value='8']");
    By buttonNine = By.xpath("//button[@value='9']");

    By buttonMultipication = By.xpath("//button[@value='*']");
    By buttonPlus = By.xpath("//button[@value='+']");
    By buttonMinus = By.xpath("//button[@value='-']");
    By buttonDivide = By.xpath("//button[@value='/']");
    By buttonEqual = By.xpath("//button[@id='resultButton']");

    By buttonClearEntry = By.xpath("//button[@id='deleteButton']");
    By buttonAllClear = By.xpath("//button[@id='clearButton']");

    By mainScreen = By.xpath("//div[@id='output']");
    By subScreen = By.xpath("//div[@id='output2']");

    public PageObject(WebDriver driver) {
        super(driver);
    }

    public String getMainScreenText(){
        return driver.findElement(mainScreen).getText();
    }

    public String getSubScreenText(){
        return driver.findElement(subScreen).getText();
    }
}