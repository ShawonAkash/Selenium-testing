package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.Search;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    public WebDriver driver;
    protected Search search;


//    public BaseTests(WebDriver driver) {
//        this.driver = driver;
//    }
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://news.google.com/topstories?hl=en-US&gl=US&ceid=US:en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        search = new Search(driver);
    }
//    public static void main(String args[]){
//        BaseTests baseTests = new BaseTests();
//        baseTests.setup();
//    }
}
