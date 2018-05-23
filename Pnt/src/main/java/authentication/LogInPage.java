package authentication;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.LinkedList;
import java.util.List;

public class LogInPage {
    @FindBy(xpath = "//div[@id='globl-cont']/span/a")
    public WebElement logingButton;

    @FindBy(xpath = "//div[@class = 'tborder login']/div[3]/dl/dd/input")
    public WebElement enterUserName;

    @FindBy(css = ".input_password")
    public WebElement enterPassword;

    public void clickOnLogIn() {
        logingButton.click();
    }

    public void typeUserName() {
        enterUserName.sendKeys("testuser1");
    }

    public void typePassword() {
        enterPassword.sendKeys("abcd1234", Keys.ENTER);
    }

    public void logInToForum(WebDriver driver1) {
        clickOnLogIn();
        CommonAPI.handleNewTab(driver1);
        typeUserName();
        typePassword();
        String title = driver1.getTitle();
//        Assert.assertEquals(title, "Forum of PeopleNTech - Index");
////        System.out.println(title);
    }
}
