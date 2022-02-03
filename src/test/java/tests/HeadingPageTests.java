package tests;

import base.BaseTests;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.HeadingPage;


public class HeadingPageTests extends BaseTests {
    @Test
    public void testFollow(){
        HeadingPage headingPage = homePage.clickHeading();
        headingPage.clickFollow();
        headingPage.clickShare();
        String url = driver.getCurrentUrl();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(url);
    }
}
