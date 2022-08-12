package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CalculatorTest extends BaseTest {

    @Test
    public void clearEntryTest(){

        PageObject page = new PageObject(driver);

        Assert.assertEquals("0", page.getMainScreenText());

        driver.findElement(page.buttonOne).click();
        driver.findElement(page.buttonTwo).click();
        driver.findElement(page.buttonThree).click();
        driver.findElement(page.buttonFour).click();
        driver.findElement(page.buttonFive).click();
        driver.findElement(page.buttonSix).click();
        driver.findElement(page.buttonSeven).click();
        driver.findElement(page.buttonEight).click();
        driver.findElement(page.buttonNine).click();
        Assert.assertEquals("123456789", page.getMainScreenText());

        driver.findElement(page.buttonClearEntry).click();
        driver.findElement(page.buttonClearEntry).click();

        Assert.assertEquals("1234567", page.getSubScreenText());
        Assert.assertEquals("1234567", page.getMainScreenText());
    }
}