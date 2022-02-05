package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePage {
    private WebDriver driver;
    private By headlines = By.xpath("//body[1]/c-wiz[1]/div[1]/div[2]/div[2]/div[1]/main[1]/c-wiz[1]/div[1]/div[1]/div[2]");
    private By signIn = By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/a");
    private By title = By.xpath("/html/body/c-wiz/div/div[2]/div[2]/div/main/c-wiz/div[1]/div[1]/div[3]/div");
    private By saveForLater = By.xpath("//body[1]/c-wiz[1]/div[1]/div[2]/div[2]/div[1]/main[1]/c-wiz[1]/div[1]/div[1]/div[3]/div[1]/div[1]/article[1]/div[1]/menu[1]/div[1]");
    private By share = By.xpath("//body[1]/c-wiz[1]/div[1]/div[2]/div[2]/div[1]/main[1]/c-wiz[1]/div[1]/div[1]/div[3]/div[1]/div[1]/article[1]/div[1]/menu[1]/span[1]/div[1]");
    private By more = By.xpath("//body[1]/c-wiz[1]/div[1]/div[2]/div[2]/div[1]/main[1]/c-wiz[1]/div[1]/div[1]/div[3]/div[1]/div[1]/article[1]/div[1]/menu[1]/span[2]/div[1]");
    private By viewFull = By.linkText("View Full Coverage");
    private By hide = By.linkText("More stories like this");
    private By copyLink = By.xpath("/html/body/div[12]/div[2]/div/div/div[3]/div[2]/div[1]/button");
    private By celsius = By.xpath("/html/body/c-wiz/div/div[2]/div[2]/div/aside/c-wiz/div/div[1]/div/footer/div/div[1]/button");

    private By factTitle = By.xpath("/html/body/c-wiz/div/div[2]/div[2]/div/aside/c-wiz/div/div[2]/div/div[2]/article[1]/a");
    private By factMore = By.xpath("/html/body/c-wiz/div/div[2]/div[2]/div/aside/c-wiz/div/div[2]/div/div[2]/article[1]/div/menu/span[2]");

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
    public void hoverOverTitle(){
        WebElement Title = driver.findElement(title);
        Actions actions = new Actions(driver);
        actions.moveToElement(Title).perform();
        driver.findElement(saveForLater).click();
    }
    public void hoverOverShare(){
        WebElement Share = driver.findElement(share);
        Actions actions = new Actions(driver);
        actions.moveToElement(Share).perform();
        driver.findElement(share).click();
        driver.findElement(copyLink).click();
    }
    public ViewFullCoverage hoverOverMore(){
        WebElement Title = driver.findElement(title);
        Actions actions = new Actions(driver);
        actions.moveToElement(Title).perform();
        driver.findElement(more).click();

        WebElement Hide = driver.findElement(hide);
        Actions action = new Actions(driver);
        action.moveToElement(Hide).perform();
        driver.findElement(hide).click();

        WebElement ViewFull = driver.findElement(viewFull);
        Actions action2 = new Actions(driver);
        action2.moveToElement(ViewFull).perform();
        driver.findElement(viewFull).click();

        return new ViewFullCoverage(driver);
    }
    //Temperature
    public void scaleChange(){
        driver.findElement(celsius).click();
    }
    //Fact check
    public void FactCheck(){
        WebElement FactTitle = driver.findElement(factTitle);
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(FactTitle).perform();
        driver.findElement(factMore).click();
    }


}
