package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends BaseTest {

    @Test
    public void clearEntryTest(){

        Assert.assertTrue(calculatorPage.isDisplayed());

        calculatorPage
                .clickButtonOne()
                .clickButtonTwo()
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonFive()
                .clickButtonSix()
                .clickButtonSeven()
                .clickButtonEight()
                .clickButtonNine()
                .clickButtonZero();

        Assert.assertEquals("1234567890", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonClearEntry()
                .clickButtonClearEntry()
                .clickButtonClearEntry();

        Assert.assertEquals("1234567", calculatorPage.getSubScreenText());
        Assert.assertEquals("1234567", calculatorPage.getMainScreenText());

    }
}