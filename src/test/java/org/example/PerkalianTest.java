package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PerkalianTest extends BaseTest {
    //open web browser
    //open url https://greyli.github.io/calculator/

    @Test
    public void testPerkalian() {
        Operator operator = new Operator(driver);
        operator.setButtonAngka3();
        operator.setButtonKali();
        operator.setButtonAngka1();
        operator.setButtonEnter();
        Assert.assertTrue(operator.isDisplayed());
    }
}
