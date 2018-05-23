package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearch extends CommonAPI{

    //@Test
    public void searchSeleniumBook(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium Book", Keys.ENTER);
    }
}
