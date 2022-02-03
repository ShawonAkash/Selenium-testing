package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HeadingPage {
    private WebDriver driver;
    private By follow = By.xpath("//body[1]/c-wiz[2]/div[1]/div[2]/c-wiz[1]/div[1]/div[1]/div[2]/div[1]");
    private By share = By.xpath("//body[1]/c-wiz[2]/div[1]/div[2]/c-wiz[1]/div[1]/div[1]/div[2]/div[2]");
    private By copyLink = By.xpath("//body[1]/div[13]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]");
    private By html = By.cssSelector("html");
    public HeadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFollow(){
        driver.findElement(follow).click();
    }
    public void clickShare(){
        driver.findElement(share).click();
        driver.findElement(copyLink).click();
    }
}
