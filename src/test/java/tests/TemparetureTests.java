package tests;

import base.BaseTests;
import org.testng.annotations.Test;

public class TemparetureTests extends BaseTests {
    @Test
    public void ScaleChangeTest(){
        homePage.scaleChange();
    }
}
