package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchNewsInTests extends BaseTests {
    @Test
    public void testNarrowSearch(){
        SearchPage searchPage= search.clickNarrowSearch();

    }
}
