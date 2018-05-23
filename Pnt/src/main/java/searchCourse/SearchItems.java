package searchCourse;

import authentication.LogInPage;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchItems extends CommonAPI{

    @FindBy(xpath = "//li[@id='button_search']/a")
    public WebElement clickSearch;
    @FindBy(css = ".input_text")
    public WebElement enterCourseName;

    public void clickSearchTab(){
        clickSearch.click();
    }

    public void enterSkills(){
        enterCourseName.sendKeys("Selenium", Keys.ENTER);
    }

    public void searchSkills(WebDriver driver1){

//        LogInPage logInPage = PageFactory.initElements(driver1, LogInPage.class);
//        logInPage.logInToForum(driver1);
        clickSearchTab();
        enterSkills();
        String title = getTitle(driver1);
        String expected = "Search Results";
        Assert.assertEquals(title, expected);
        System.out.println(title);
    }

}
