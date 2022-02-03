package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchFeatureTests extends BaseTests {

    @Test
    public void testSearchFeature(){
        SearchPage searchPage= search.clickSearchFeatureTopic();
        driver.quit();
    }
}

