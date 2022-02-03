package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.Search;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    public WebDriver driver;
    protected Search search;
    protected HomePage homePage;
    protected LoginPage loginPage;


//    public BaseTests(WebDriver driver) {
//        this.driver = driver;
//    }
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://news.google.com/topstories?hl=en-US&gl=US&ceid=US:en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        homePage= new HomePage(driver);
        search = new Search(driver);
        loginPage = new LoginPage(driver);

        LoginPage loginPage = homePage.clickSignIn();
        loginPage.setEmailField("bdflickr@gmail.com");
        loginPage.setPasswordField("shantoft12345");
    }
//    public static void main(String args[]){
//        BaseTests baseTests = new BaseTests();
//        baseTests.setup();
//    }
}
