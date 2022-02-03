package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Search;
import pages.SearchPage;

public class BaseTests {
    private WebDriver driver;
    protected Search search;


//    public BaseTests(WebDriver driver) {
//        this.driver = driver;
//    }

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://news.google.com/topstories?hl=en-US&gl=US&ceid=US:en");
        driver.manage().window().maximize();
        search = new Search(driver);
    }
//    public static void main(String args[]){
//        BaseTests baseTests = new BaseTests();
//        baseTests.setup();
//    }
}
