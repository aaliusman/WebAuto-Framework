package search;

import base.CommonAPI;
import home.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLandingPage extends CommonAPI{

    @Test
    public void test1() throws IOException, InterruptedException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
