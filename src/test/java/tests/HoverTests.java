package tests;

import base.BaseTests;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.HomePage;

public class HoverTests extends BaseTests {
    @Test
    public void hoverOver(){
        homePage.hoverOverTitle();
        homePage.hoverOverMore();

    }
    @Test
    public void hoverOverShare(){
        homePage.hoverOverTitle();
        homePage.hoverOverShare();
        String url = driver.getCurrentUrl();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(url);
    }
}
