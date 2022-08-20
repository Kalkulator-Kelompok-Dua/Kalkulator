package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Operator {
    WebDriver driver;
    By buttonAngka0 = By.xpath("//button[@class='nums btn-zero btn btn-default']");
    By buttonAngka1 = By.xpath("//button[.='1']");
    By buttonAngka2 = By.xpath("//button[.='2']");
    By buttonAngka3 = By.xpath("//button[.='3']");
    By buttonAngka4 = By.xpath("//button[.='4']");
    By buttonAngka5 = By.xpath("//button[.='5']");
    By buttonAngka6 = By.xpath("//button[.='6']");
    By buttonAngka7 = By.xpath("//button[.='7']");
    By buttonAngka8 = By.xpath("//button[.='8']");
    By buttonAngka9 = By.xpath("//button[.='9']");
    By buttonAc = By.xpath("//button[@id='clearButton']");
    By buttonCe = By.xpath("//button[@id='deleteButton']");
    By buttonBagi = By.xpath("//button[.='/']");
    By buttonKali = By.xpath("//button[.='x']");
    By buttonKurang = By.xpath("//button[.='-']");
    By buttonTambah = By.xpath("//button[.='+']");
    By buttonEnter = By.xpath("//button[@id='resultButton']");
    By buttonTitik = By.xpath("//button[.='.']");
    By layar = By.xpath("//div[@class='screen']");

    public Operator(WebDriver driver) {
        this.driver = driver;
    }

    public void setButtonAngka3() {
        driver.findElement(buttonAngka3).click();
    }

    public void setButtonKali() {
        driver.findElement(buttonKali).click();
    }

    public void setButtonAngka1() {
        driver.findElement(buttonAngka1).click();
    }

    public void setButtonEnter() {
        driver.findElement(buttonEnter).click();
    }

    public boolean isDisplayed() {
        return driver.findElement(layar).isDisplayed();
    }
}
