package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorPage extends Helper{

    /** Number Button */
    By buttonOne = By.xpath("//button[@value='1']");
    By buttonTwo = By.xpath("//button[@value='2']");
    By buttonThree = By.xpath("//button[@value='3']");
    By buttonFour = By.xpath("//button[@value='4']");
    By buttonFive = By.xpath("//button[@value='5']");
    By buttonSix = By.xpath("//button[@value='6']");
    By buttonSeven = By.xpath("//button[@value='7']");
    By buttonEight = By.xpath("//button[@value='8']");
    By buttonNine = By.xpath("//button[@value='9']");
    By buttonZero = By.xpath("//button[@value='0']");

    /** Function Button */
    By buttonMultipication = By.xpath("//button[@value='*']");
    By buttonPlus = By.xpath("//button[@value='+']");
    By buttonMinus = By.xpath("//button[@value='-']");
    By buttonDivide = By.xpath("//button[@value='/']");
    By buttonEqual = By.xpath("//button[@id='resultButton']");
    By buttonComma = By.xpath("//button[@value='.']");
    By buttonClearEntry = By.xpath("//button[@id='deleteButton']");
    By buttonAllClear = By.xpath("//button[@id='clearButton']");

    /** Screen Locator */
    By mainScreen = By.xpath("//div[@id='output']");
    By subScreen = By.xpath("//div[@id='output2']");

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public String getMainScreenText(){
        return getText(mainScreen);
    }

    public String getSubScreenText(){
        return getText(subScreen);
    }
    public boolean isDisplayed(){
        return verifyElement(buttonZero);
    }

    public CalculatorPage clickButtonClearEntry(){
        click(buttonClearEntry);
        return this;
    }

    public CalculatorPage clickButtonOne(){
        click(buttonOne);
        return this;
    }

    public CalculatorPage clickButtonTwo(){
        click(buttonTwo);
        return this;
    }

    public CalculatorPage clickButtonThree(){
        click(buttonThree);
        return this;
    }

    public CalculatorPage clickButtonFour(){
        click(buttonFour);
        return this;
    }

    public CalculatorPage clickButtonFive(){
        click(buttonFive);
        return this;
    }

    public CalculatorPage clickButtonSix(){
        click(buttonSix);
        return this;
    }

    public CalculatorPage clickButtonSeven(){
        click(buttonSeven);
        return this;
    }

    public CalculatorPage clickButtonEight(){
        click(buttonEight);
        return this;
    }

    public CalculatorPage clickButtonNine(){
        click(buttonNine);
        return this;
    }

    public CalculatorPage clickButtonZero(){
        click(buttonZero);
        return this;
    }

}