package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;

public class Search {
    private WebDriver driver;
    private By searchBar = By.xpath("//*[@id=\"gb\"]/div[2]/div[2]/div/form/div[1]/div/div/div/div/div[1]/input[2]");
    private By featureTopic = By.xpath("//*[@id=\"nngdp4240\"]/div/div/div");
    private By newsIn = By.xpath("//*[@id=\"nngdp4241\"]");
    private By narrowSearch = By.xpath("//*[@id=\"gb\"]/div[2]/div[2]/div/form/button[2]");
    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage clickSearchFeatureTopic(){
        driver.findElement(searchBar).click();
        driver.findElement(featureTopic).click();
        return new SearchPage(driver);
    }
}
