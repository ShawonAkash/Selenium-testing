package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    private final WebDriver driver;

    private By searchBar = By.xpath("//*[@id=\"gb\"]/div[2]/div[2]/div/form/div[1]/div/div/div/div/div[1]/input[2]");
    private By featureTopic = By.xpath("//body[1]/div[4]/header[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
    private By newsIn = By.xpath("/html[1]/body[1]/div[4]/header[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]");
    private By narrowSearch = By.xpath("//*[@id=\"gb\"]/div[2]/div[2]/div/form/button[2]");
    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage clickSearchFeatureTopic(){
        driver.findElement(searchBar).click();
        driver.findElement(featureTopic).click();
        return new SearchPage(driver);
    }
    public SearchPage clickSearchNewsTopic(){
        driver.findElement(searchBar).click();
        driver.findElement(newsIn).click();
        return new SearchPage(driver);
    }
    public SearchPage clickNarrowSearch(){
        //driver.findElement(searchBar).click();
        driver.findElement(narrowSearch).click();
        return new SearchPage(driver);
    }
}
