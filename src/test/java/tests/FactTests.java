package tests;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FactTests extends BaseTests {
    @Test
    public void HoverOverMore(){
        homePage.FactCheck();
        WebElement GO = driver.findElement(By.linkText("Go to PolitiFact"));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(GO).perform();


    }

}
