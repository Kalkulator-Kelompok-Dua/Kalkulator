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

    // Penjumlahan
    @Test
    public void additionTest() {
        Assert.assertTrue(calculatorPage.isDisplayed());
        calculatorPage
                .clickButtonFour();
        Assert.assertEquals("4", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonPlus();
        Assert.assertEquals("+", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonSix();
        Assert.assertEquals("6", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonResult();
        Assert.assertEquals("10", calculatorPage.getMainScreenText());

    }

    // Pengurangan
    @Test
    public void subtractionTest() {
        Assert.assertTrue(calculatorPage.isDisplayed());
        calculatorPage
                .clickButtonFour();
        Assert.assertEquals("4", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonMinus();
        Assert.assertEquals("-", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonThree();
        Assert.assertEquals("3", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonResult();
        Assert.assertEquals("1", calculatorPage.getMainScreenText());

    }

    // Perkalian
    @Test
    public void multiplicationTest() {
        Assert.assertTrue(calculatorPage.isDisplayed());
        calculatorPage
                .clickButtonTwo();
        Assert.assertEquals("2", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonMultiplication();
        Assert.assertEquals("*", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonTwo()
                .clickButtonFive();
        Assert.assertEquals("25", calculatorPage.getMainScreenText());

        calculatorPage
                .clickButtonResult();
        Assert.assertEquals("50", calculatorPage.getMainScreenText());

    }
}