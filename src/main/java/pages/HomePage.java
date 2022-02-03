package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;
    private By headlines = By.xpath("//body[1]/c-wiz[1]/div[1]/div[2]/div[2]/div[1]/main[1]/c-wiz[1]/div[1]/div[1]/div[2]");
    private By signIn = By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/a");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HeadingPage clickHeading(){
        driver.findElement(headlines).click();
        return new HeadingPage(driver);
    }
    public LoginPage clickSignIn(){
        driver.findElement(signIn).click();
        return new LoginPage(driver);
    }
}
